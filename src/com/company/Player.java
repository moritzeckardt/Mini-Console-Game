package com.company;

public class Player {
    //Properties
    private final char[] playerSign;
    private int currentRow;
    private int currentColumn;
    private int counter;

    //Constructor
    Player(Field field) {
        playerSign = new char[4];
        playerSign[0] = '^';
        playerSign[1] = '>';
        playerSign[2] = 'v';
        playerSign[3] = '<';

        currentRow = 5;
        currentColumn = 9;
        counter = 0;

        field.getField()[currentRow][currentColumn] = playerSign[counter];
    }

    //Methods
    public void moveForward(Field field) {
        if(counter == 0) {
            System.out.println();
            field.fillField();
            currentRow--;

            if(currentRow == 0) {
                currentRow = 1;
                field.getField()[currentRow][currentColumn] = playerSign[counter];
                field.printField();
                System.out.println("=> Not possible!");
            }
            else {
                field.getField()[currentRow][currentColumn] = playerSign[counter];
                field.printField();
            }
        }
        else if(counter == 1) {
            System.out.println();
            field.fillField();
            currentColumn++;

            if(currentColumn == 19) {
                currentColumn = 18;
                field.getField()[currentRow][currentColumn] = playerSign[counter];
                field.printField();
                System.out.println("=> Not possible!");
            }
            else {
                field.getField()[currentRow][currentColumn] = playerSign[counter];
                field.printField();
            }
        }
        else if(counter == 2) {
            System.out.println();
            field.fillField();
            currentRow++;

            if(currentRow == 9) {
                currentRow = 8;
                field.getField()[currentRow][currentColumn] = playerSign[counter];
                field.printField();
                System.out.println("=> Not possible!");
            }
            else {
                field.getField()[currentRow][currentColumn] = playerSign[counter];
                field.printField();
            }
        }
        else if(counter == 3) {
            System.out.println();
            field.fillField();
            currentColumn--;

            if(currentColumn == 0) {
                currentColumn = 1;
                field.getField()[currentRow][currentColumn] = playerSign[counter];
                field.printField();
                System.out.println("=> Not possible!");
            }
            else {
                field.getField()[currentRow][currentColumn] = playerSign[counter];
                field.printField();
            }
        }
        else {
            System.out.println();
            System.out.println("=> An error has occurred.");
        }
    }

    public void turnRight(Field field) {
        System.out.println();
        field.fillField();

        counter++;

        if(counter > 3) {
            counter = 0;
        }

        field.getField()[currentRow][currentColumn] = playerSign[counter];
        field.printField();
    }

    public void turnLeft(Field field) {
        System.out.println();
        field.fillField();

        counter--;

        if(counter < 0) {
            counter = 3;
        }

        field.getField()[currentRow][currentColumn] = playerSign[counter];
        field.printField();
    }
}
