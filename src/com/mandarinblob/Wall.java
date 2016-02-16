package com.mandarinblob;

/**
 * Created by Lisa on 2016-02-16.
 */
public class Wall extends BaseEntity{

    public Wall(int xx, int yy){
        super(xx,yy);
    }

    public Wall clone() throws CloneNotSupportedException {
        Wall z =  (Wall) super.clone();
        return z;
    }




    public char getChar() {
        return '#';
    }

}
