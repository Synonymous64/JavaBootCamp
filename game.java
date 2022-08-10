package projects.forJava;


import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        System.out.println("Welcome to the rock paper scissors game.");
        System.out.println("Lets get started with our game.");
        System.out.println("Every Player will get five turn to try there luck.");
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Please Enter your name - :");
        name = sc.nextLine();
        System.out.println("GOODLUCK :)");
        System.out.println("Press\n 1 - for Rock\n 2 - for Paper\n 3 - for scissor");
        System.out.println("___________________START_________________");
        int n = 0;
        int[] compScore = new int[5], playerScore = new int[5];
        while (n < 5) {
            int rock = 1, paper = 2, scissor = 3, playerTurn = 0, compTurn = 0;
            playerTurn = sc.nextInt();
            Random rd = new Random();
            compTurn = (rd.nextInt(3) + 1);
            if (playerTurn == rock && compTurn == paper) {
                System.out.println("Computer chose - : " + compTurn);
                System.out.println("PLUS ONE FOR COMPUTER");
                compScore[n] = 1;
            }
            if (playerTurn == paper && compTurn == scissor) {
                System.out.println("Computer chose - : " + compTurn);
                System.out.println("PLUS ONE FOR COMPUTER");
                compScore[n] = 1;

            }
            if (playerTurn == scissor && compTurn == rock) {
                System.out.println("Computer chose - : " + compTurn);
                System.out.println("PLUS ONE FOR COMPUTER");
                compScore[n] = 1;

            }
            if (compTurn == rock && playerTurn == paper) {
                System.out.println("Computer chose - : " + compTurn);
                System.out.println("PLUS ONE FOR PLAYER");
                playerScore[n] = 1;
            }
            if (compTurn == paper && playerTurn == scissor) {
                System.out.println("Computer chose - : " + compTurn);
                System.out.println("PLUS ONE FOR PLAYER");
                playerScore[n] = 1;

            }
            if (compTurn == scissor && playerTurn == rock) {
                System.out.println("Computer chose - : " + compTurn);
                System.out.println("PLUS ONE FOR PLAYER");
                playerScore[n] = 1;

            }
            if (playerTurn == compTurn) {
                System.out.println("Computer chose - : " + compTurn);
                System.out.println("MATCH TIED MINUS ONE FOR THE BOTH CONTESTANT");
                playerScore[n] = -1;
                compScore[n] = -1;
            }
            if (playerTurn > 3) {
                System.out.println("INVALID INPUT");
                continue;
            }
            ;
            n++;
        }
        int totalcompScore = 0, totalplayerScore = 0;
        System.out.println("_________________________________________");
        System.out.println();
        System.out.println("...AND THE SCORE CARD IS HERE\n");
        System.out.println("PLAYER SCORE           ||     COMPUTER SCORE\n");
        for(int i = 0; i < 5; ++i){ 
            System.out.println("               "+ playerScore[i] +"      ||      "+ compScore[i]);
            totalplayerScore += playerScore[i];
            totalcompScore += compScore[i];
        }
        System.out.println("\n");
        System.err.println("Computer Score is -: " + totalcompScore);
        System.err.println(name + " Score is -: " + totalplayerScore);
        System.out.println("_________________________________________");
        if (totalplayerScore < totalcompScore) {
            System.out.println("THE WINNER IS COMPUTER");
        } else if (totalplayerScore > totalcompScore) {
            System.out.println("THE WINNER IS " + name);
        } else
            System.out.println("MATCH TIED");
        sc.close();
    }
}
