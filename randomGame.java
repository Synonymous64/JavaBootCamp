package projects;

import java.util.Random;
import java.util.Scanner;

class GuessTheNumber{
    private int inputNum;
    private int guessTheNum;
    private int countGuesses;
    public GuessTheNumber(){
        Random rd = new Random();
        guessTheNum = (rd.nextInt(100) + 0);
    }
    public void userInput(int inputNum){
        this.inputNum = inputNum;
    }
    public boolean isCorrectNum(int inputNum){
        if(this.inputNum == this.guessTheNum) return true;
        else return false;
    }
    public void setGuessCount(int num){
        this.countGuesses = num;
    }
    public int getGuessCount(){
        return countGuesses;
    }
    public boolean isLess(){
        if(this.inputNum < this.guessTheNum) return true;
        else return false;
    }
    public boolean isBig(){
        if(this.inputNum > this.guessTheNum) return true;
        else return false;
    }
    public void actualNumber(){
        System.out.println("The actual number is - : " + this.guessTheNum);
        System.out.println("Congratulations you won");
    }
}
public class randomGame {
    public static void main(String[] args) {
        GuessTheNumber G =  new GuessTheNumber();
        int num = 0;
        System.out.println("Enter the element");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        System.out.println();
        G.userInput(num);
        int guessNumber = 0;
        while(!G.isCorrectNum(num)){
            if(G.isLess()){
                System.out.println("The input number is lesser than the actual number...try again");
                num = sc.nextInt();
                G.userInput(num);
            }
            else if(G.isBig()){
                System.out.println("The input number is bigger than the actual number...try again");
                num = sc.nextInt();
                G.userInput(num);
            }
            guessNumber++;
        }
        G.actualNumber();
        G.setGuessCount(guessNumber);
        System.out.println("The total guesses were " + G.getGuessCount());
        sc.close();
    }
}
