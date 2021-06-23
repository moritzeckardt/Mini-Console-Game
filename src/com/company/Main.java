package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Variables
        Scanner sc = new Scanner(System.in);
        Field field = new Field();
        Player player1 = new Player(field);
        int temp = 0;

        //Print menu
        System.out.println("MINI CONSOLE GAME");
        System.out.println("1. Press w => MOVE FORWARD");
        System.out.println("2. Press d => TURN RIGHT");
        System.out.println("3. Press d => TURN LEFT");
        System.out.println("4. Press x => CLOSE GAME");

        //Create field
        field.fillField();
        field.printField();

        //Handle movement
        while(temp == 0) {
            System.out.print("=> Your Move: ");
            String letter = sc.next();

            switch(letter) {
                case "w": player1.moveForward(field); break;
                case "d": player1.turnRight(field); break;
                case "a": player1.turnLeft(field); break;
                case "x": System.out.println("=> The game is over!"); temp = 1; break;
                default: System.out.println("=> An error has occurred. Wrong input!"); break;
            }
        }
    }
}
