package com.company;

import java.util.Arrays;

public class DominoSet {

    public static byte[][] fullDominoSet = new byte[91][2]; //domino index, 0 is empty, 1 is a 0,0 domino.  This 0 index will read empty when checking for repeats
    public static byte totalDominosInPlay;
    public static byte[][] dominosInPlay = new byte[91][2];
    public static final byte[] nullDomino = {0,0};


    public DominoSet(byte[][] fullDominoSet) {
        this.fullDominoSet = fullDominoSet;
    }

    public static void createDominoSet() {
        byte counterForDomino = 0;
        for (byte i = 0; i < 13; i++) {
            for (byte j = i; j < 13; j++) {
                fullDominoSet[counterForDomino][0] = i;
                fullDominoSet[counterForDomino][1] = j;
                counterForDomino += 1;
            }
        }
    }

    public static byte[] flipDomino(byte[] inputDomino) {
        byte[] flippedDomino = new byte[2];
        flippedDomino[0] = inputDomino[1];
        flippedDomino[1] = inputDomino[0];
        return flippedDomino;
    }

    public static byte[] getNewDomino() {
        boolean breakVar = false;
        byte[] newDomino = new byte[2];
        byte[] dominoBeingChecked = new byte[2];

        if (totalDominosInPlay < 92) {
            while (true) {
                newDomino[0] = (byte) (12 * Math.random());
                newDomino[1] = (byte) (12 * Math.random());
                Arrays.sort(newDomino);
                boolean dominoIsRepeating = dominoChecker(newDomino);
                if (dominoIsRepeating == true)
                    continue;
                break;
            }
            recordDominoToFullSetinPlay(newDomino);
            return newDomino;
        }
        else{
            System.out.println("There are no more dominos to be domino'd");
            return nullDomino;
        }

    }

    public static Boolean dominoChecker(byte[] inputDomino) {
        boolean dominoIsRepeating = false;
        for (int i = 0; i < totalDominosInPlay; i++) {
            if ((dominosInPlay[i][0] == inputDomino[0]) && (dominosInPlay[i][1] == inputDomino[1]))
                dominoIsRepeating = true;
        }
        return dominoIsRepeating;
    }

    public static void recordDominoToFullSetinPlay(byte[] inputDomino){
        DominoSet.dominosInPlay[DominoSet.totalDominosInPlay][0]= inputDomino[0];
        DominoSet.dominosInPlay[DominoSet.totalDominosInPlay][1]= inputDomino[1];
        DominoSet.totalDominosInPlay +=1;
    }

}
