package com.mandarinblob;

/**
 * Created by Xylofo on 2016-02-13.
 */
public class BaseBlob extends BaseEntity{

    public void onKeyPress(int key) {
        System.out.printf("Blob at (%d,%d) got key #%d",x,y,key);
    }

    public char getChar() {
        return 'B';
    }

}
