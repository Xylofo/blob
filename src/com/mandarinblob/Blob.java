package com.mandarinblob;

/**
 * Created by Xylofo on 2016-02-13.
 */
public class Blob extends BaseBlob {

    public Blob(int xx, int yy) {
        super(xx, yy);
    }

    public Blob clone() throws CloneNotSupportedException {
        Blob z =  (Blob) super.clone();
        return z;
    }

    public void update(int key, Board oldBoard, Board newBoard) {
        System.out.printf("Blob at (%d,%d) got key #%d\n",x,y,key);
        switch ((char)key){
            case 'w': moveUp   (oldBoard,newBoard); break;
            case 's': moveDown (oldBoard,newBoard); break;
            case 'a': moveLeft (oldBoard,newBoard); break;
            case 'd': moveRight(oldBoard,newBoard); break;
        }
    }


}
