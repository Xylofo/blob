package com.mandarinblob;

/**
 * Created by Lisa on 2016-02-15.
 */

public class AntiBlob extends BaseBlob {

    public AntiBlob(int xx, int yy) {
        super(xx, yy);
    }

    public AntiBlob clone() throws CloneNotSupportedException {
        AntiBlob z =  (AntiBlob) super.clone();
        return z;
    }

    public void update(int key, Board oldBoard, Board newBoard) {
        //System.out.printf("Blob at (%d,%d) got key #%d\n",x,y,key);
        switch ((char)key){
            //reverse movement
            case 'w': moveDown   (oldBoard,newBoard); break;
            case 's': moveUp (oldBoard,newBoard); break;
            case 'a': moveRight (oldBoard,newBoard); break;
            case 'd': moveLeft(oldBoard,newBoard); break;
        }
    }
    public char getChar() {
        return 'O';
    }
}
