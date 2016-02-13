package com.mandarinblob;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String s = "...\n.X.\nBBB\n...";
        Board board = new Board(4,3,s);
        boolean done = false;
        while(!done){
            System.out.println(board.toString());
            String ss = scanner.next();
            char c = ss.charAt(0);
            board = board.onKeyPress(c);
        }
    }
}
