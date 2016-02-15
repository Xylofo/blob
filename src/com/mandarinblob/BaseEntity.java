package com.mandarinblob;

/**
 * Created by Xylofo on 2016-02-13.
 */
public class BaseEntity implements Cloneable{

    public BaseEntity(int xx, int yy){
        x = xx;
        y = yy;
    }

    public BaseEntity clone() throws CloneNotSupportedException {
        BaseEntity z =  (BaseEntity) super.clone();
        z.x = x;
        z.y = y;
        return z;
    }

    protected int x;
    protected int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void update(int key, Board oldBoard, Board newBoard) {
        noMove(oldBoard,newBoard);
    }

    public char getChar() {
        return '.';
    }

    protected void noMove(Board oldBoard, Board newBoard){
        newBoard.entities[x][y] = merge(newBoard.entities[x][y], this);
    }

    public static BaseEntity merge (BaseEntity a, BaseEntity b) {
        try {
            a = a.clone();
            b = b.clone();
        } catch(CloneNotSupportedException e){
            System.err.println("Ooops\n");
            System.exit(-1);
        }
        b.setX(a.getX());
        b.setY(a.getY());

        //If one is basket, basket remains
        if(a instanceof Basket){
            return a;
        }
        if(b instanceof Basket){
            return b;
        }
        //If both are blobs, they merge
        if (a instanceof Blob && b instanceof Blob){
            return a;
        }
        //If antiblob meets blob, they disappear
        if(b instanceof Blob && a instanceof AntiBlob){
            return new BaseEntity(a.getX(), a.getY()); //return empty
        }
        if(b instanceof AntiBlob && a instanceof Blob) {
            return new BaseEntity(a.getX(), a.getY()); //return empty
        }
        //if one is blob and the other is empty, blob will be there
        if(a instanceof Blob) {
            return a;
        }
        if(b instanceof Blob) {
            return b;
        }
        if(a instanceof AntiBlob) {
            return a;
        }
        if(b instanceof AntiBlob) {
            return b;
        }
        return a;
    }
}
