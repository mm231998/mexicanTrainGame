package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Hashtable;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {
        DominoSet.createDominoSet();
        MexicanTrainGame.createPlayers();
        MexicanTrainGame.ammountOfPlayers = 4;
        MexicanTrainGame.dealDominosToPlayers();
        var train1 = new MexicanTrainGame();
        train1.trainValue = MexicanTrainGame.startingDomino()[0];
        System.out.println(DominoSet.totalDominosInPlay);


    }

}

