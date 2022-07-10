package C7_LinearArray;

import java.util.Scanner;

/**
 * guess a word
 */
public class P35_GuessWord {
    private static Scanner input=new Scanner(System.in);
    public static void game(){
        char c;
        do{
            guessWordOneGame();
            System.out.print("Do you want to guess another word? Enter y or n: ");
            c=input.next().charAt(0);
        }while(c=='y');
    }

    /**
     * play game once
     */
    public static void guessWordOneGame(){
        int missTimes=0;
        String word;
        char[] chars;
        boolean[] conditions;
        //get word
        word=getRandomWord();
        chars=word.toCharArray();
        conditions=new boolean[word.length()];
        //repeat guess if not finished
        while(!ifFinish(conditions)){
            missTimes+=oneGuess(chars,conditions)?0:1;
        }
        //one game finish, print infos
        System.out.println("The word is "+word+". You missed "+missTimes+" times");
    }

    /**
     * get a random word
     * @return
     */
    public static String getRandomWord(){
        //String[] strings={"Chris","Sean","Program","WhatTheFuck"};
        String[] strings={"Program"};
        int length=strings.length;
        return strings[(int)(Math.random()*length)];
    }

    /**
     * check if one game finish
     * @param conditions
     * @return
     */
    public static boolean ifFinish(boolean[] conditions){
        for(int i=0;i<conditions.length;i++){
            if(!conditions[i]){
                return false;
            }
        }
        return true;
    }

    /**
     * one guess, return if guess right this time
     * @param chars
     * @param conditions
     * @return
     */
    public static boolean oneGuess(char[] chars, boolean[] conditions){
        //output tips
        System.out.print("(Guess) Enter a letter in word ");
        for(int i=0;i<chars.length;i++){
            if (conditions[i]){
                System.out.print(chars[i]);
            }else{
                System.out.print("*");
            }
        }
        System.out.print(" > ");
        //input guess
        char guessChar=input.next().charAt(0);
        //check if guess right and set arrays
        boolean ifRight=false;
        for(int i=0;i<chars.length;i++){
            if(Character.toLowerCase(guessChar)==Character.toLowerCase(chars[i])){
                if(conditions[i]){
                    System.out.println("\t"+guessChar+" is already in the word.");
                    break;
                }else{
                    ifRight=true;
                    conditions[i]=true;
                }
            }
        }
        return ifRight;
    }

    public static void main(String[] args) {
        game();
    }
}
