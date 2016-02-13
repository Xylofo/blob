package com.mandarinblob;

import java.util.Vector;

/**
 * Created by joabli13 on 2016-02-13.
 */
public class Board {

    private int width;
    private int height;
    private BaseEntity[][] entities;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Board onKeyPress(int key) {
        return new Board(height, width);
    }

    public Board(int h, int w) {
        width = w;
        height = h;
        entities = new BaseEntity[height][width];
        for (int i = 0; i < h ; i++) {
            for (int j = 0; j < w ; j++) {
                entities[i][j] = new BaseEntity();
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

}
