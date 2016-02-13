package com.mandarinblob;

/**
 * Created by Xylofo on 2016-02-13.
 */
public class BaseEntity {

    protected int x;
    protected int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void onKeyPress(int key) {

    }

    public char getChar() {
        return '.';
    }
}
