package com.platzi.javatests.player;

public class Player {
    private Dice dice;
    private int minNumberToWin;

    public Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    public boolean play(){
        int diceNumbre = dice.roll();
        return diceNumbre >= minNumberToWin;
    }

}
