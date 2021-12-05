package com.company;

import java.util.Arrays;

public class MexicanTrainPlayer {
    public String playerName;
    public byte[][] playerDominoSet = new byte[40][2];
    public byte playerDominoAmmount;
    public static String[] playerList = new String[8];
    public static byte numberOfPlayers;

    public MexicanTrainPlayer(String playerName) {
        this.playerDominoSet = playerDominoSet;
        this.playerDominoAmmount = playerDominoAmmount;
        this.playerName = playerName;

    }


    public void newDomino() {
        byte[] thisNewDomino = new byte[2];
        thisNewDomino = DominoSet.getNewDomino();
        playerDominoAmmount += 1;
        this.playerDominoSet[playerDominoAmmount - 1][0] = thisNewDomino[0];
        this.playerDominoSet[playerDominoAmmount - 1][1] = thisNewDomino[1];
    }

    public void dealPlayerDominos() {
        for (int i = 0; i < 11; i++) {
            this.newDomino();
        }
    }

    public void printPlayerDominos() {
        System.out.println("Player " + this.playerName + " has " + playerDominoAmmount + " dominos.");
        for (int i = 0; i < this.playerDominoAmmount; i++) {
            System.out.print("Domino " + (i + 1) + ": [" + this.playerDominoSet[i][0] + "|" + this.playerDominoSet[i][1] + "]       ");
        }
    }
}



