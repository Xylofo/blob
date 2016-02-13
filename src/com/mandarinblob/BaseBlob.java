package com.mandarinblob;

/**
 * Created by Xylofo on 2016-02-13.
 */
public class BaseBlob extends BaseEntity{

    public BaseBlob(int xx, int yy){
        super(xx,yy);
    }

    public BaseBlob clone() throws CloneNotSupportedException {
        BaseBlob z =  (BaseBlob) super.clone();
        return z;
    }

    public void update(int key, Board oldBoard, Board newBoard) {
            System.out.printf("BaseBlob at (%d,%d) got key #%d\n",x,y,key);
    }

    protected void moveUp   (Board oldBoard,Board newBoard){
        if (x > 0) {
            newBoard.entities[x-1][y] = merge(newBoard.entities[x-1][y], this);
        } else {
            noMove(oldBoard,newBoard);
        }
    }
    protected void moveDown  (Board oldBoard,Board newBoard){
        if (x < oldBoard.getHeight()-1) {
            newBoard.entities[x+1][y] = merge(newBoard.entities[x+1][y], this);
        } else {
            noMove(oldBoard,newBoard);
        }
    }
    protected void moveLeft   (Board oldBoard,Board newBoard){
        if (y > 0) {
            newBoard.entities[x][y-1] = merge(newBoard.entities[x][y-1], this);
        } else {
            noMove(oldBoard,newBoard);
        }
    }
    protected void moveRight (Board oldBoard,Board newBoard){
        if (y < oldBoard.getWidth()-1) {
            newBoard.entities[x][y+1] = merge(newBoard.entities[x][y+1], this);
        } else {
            noMove(oldBoard,newBoard);
        }
    }

    public char getChar() {
        return 'B';
    }

}
