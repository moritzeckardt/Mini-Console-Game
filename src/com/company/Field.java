package com.company;

public class Field {
    //Properties
    private char[][] field;

    //Constructor
    Field() {
        field = new char[10][20];
    }

    //Methods
    public void fillField() {
        //Left and right wall
        for(int i = 0; i < field.length; i++) {
            field[i][0] = '#';
            field[i][19] = '#';
        }

        //Inner field
        for(int i = 1; i < field.length; i++) {
            for(int x = 1; x < 19; x++) {
                field[i][x] = ' ';
            }
        }

        //Upper wall
        for(int i = 0; i < field[0].length; i++) {
            field[0][i] = '#';
        }

        //Lower wall
        for(int i = 0; i < field[8].length; i++) {
            field[9][i] = '#';
        }
    }

    public void printField() {
        for(int i = 0; i < field.length; i++) {
            for(int x = 0; x < field[i].length; x++) {
                System.out.print(field[i][x]);
            }
            
            System.out.println();
        }
    }

    //Getter & Setter
    public char[][] getField() {
        return field;
    }
    
    public void setField(char[][] field) {
        this.field = field;
    }
}
