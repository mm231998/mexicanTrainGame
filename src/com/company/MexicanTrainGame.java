package com.company;

public class MexicanTrainGame {

    public byte trainValue;
    public static byte ammountOfTrains;
    public static byte startingDominoValue = 12;
    public static MexicanTrainPlayer[ ] playerArray = new MexicanTrainPlayer[8];
    public static byte ammountOfPlayers;



    public MexicanTrainGame() {
        this.trainValue = trainValue;
        this.playerArray = playerArray;
        this.ammountOfPlayers = ammountOfPlayers;
    }


    public static void createPlayers(){
        playerArray[0] = new MexicanTrainPlayer("player1");
        playerArray[1] = new MexicanTrainPlayer("player2");
        playerArray[2] = new MexicanTrainPlayer("player3");
        playerArray[3] = new MexicanTrainPlayer("player4");
        playerArray[4] = new MexicanTrainPlayer("player5");
        playerArray[5] = new MexicanTrainPlayer("player6");
        playerArray[6] = new MexicanTrainPlayer("player7");
        playerArray[7]= new MexicanTrainPlayer("player8");

    }

    public static byte[] startingDomino(){
        byte [] startingDomino = new byte[2];
        boolean checkingStarter = false;
        while (true){
            startingDomino[0] = startingDominoValue;
            startingDomino[1] = startingDominoValue;
            checkingStarter = DominoSet.dominoChecker(startingDomino);
            if (checkingStarter == true){
                startingDominoValue -=1;
                continue;
            }
            else
                break;
        }
        DominoSet.recordDominoToFullSetinPlay(startingDomino);
        return startingDomino;
    }

    public static void dealDominosToPlayers(){
        for (int i=0; i<ammountOfPlayers; i++){
            playerArray[i].dealPlayerDominos();
        }
    }




}


