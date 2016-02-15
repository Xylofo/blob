package com.mandarinblob;


/**
 * Created by Xylofo on 2016-02-13.
 */
public class Board {

    private int width;
    private int height;
    public BaseEntity[][] entities;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    public Board(int h, int w, String s) {
        width = w;
        height = h;
        entities = new BaseEntity[height][width];
        for (int i = 0; i < h ; i++) {
            for (int j = 0; j < w ; j++) {
                switch (s.charAt(i*(w+1)+j)){
                    case '.':
                        entities[i][j] = new BaseEntity(i,j);
                        break;

                    case 'X':
                        entities[i][j] = new Basket(i,j);
                        break;

                    case 'B':
                        entities[i][j] = new Blob(i,j);
                        break;

                    case 'O':
                        entities[i][j] = new AntiBlob(i,j);
                        break;

                    default:
                        System.err.println("Not recognised char: " + s.charAt(i*(w+1)+j));
                        System.exit(-1);
                        break;
                }
            }
        }
    }

    public Board(int h, int w) {
        width = w;
        height = h;
        entities = new BaseEntity[height][width];
        for (int i = 0; i < h ; i++) {
            for (int j = 0; j < w ; j++) {
                entities[i][j] = new BaseEntity(i,j);
            }
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (BaseEntity[] row : entities) {
            for (BaseEntity ent : row) {
                s.append(ent.getChar());
            }
            s.append('\n');
        }
        return s.toString();
    }

    public Board onKeyPress(int key) {
        Board b =  new Board(height, width);
        for (BaseEntity[] row : entities) {
            for (BaseEntity ent : row) {
                ent.update(key,this,b);
            }
        }
        return b;
    }
}
