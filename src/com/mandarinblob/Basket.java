package com.mandarinblob;

/**
 * Created by Xylofo on 2016-02-13.
 */
public class Basket extends BaseEntity {

    public Basket(int xx, int yy){
        super(xx,yy);
    }

    public Basket clone() throws CloneNotSupportedException {
        Basket z =  (Basket) super.clone();
        return z;
    }

    public char getChar() {
        return 'X';
    }

}
