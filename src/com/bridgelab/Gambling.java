package com.bridgelab;
//UC2 - As a Gambler make $1 bet so either win or loose $1
public class Gambling {
    public static void main(String[] args) {
        System.out.println("Welcome to the Gambling Simulation Problem");
        int stake = 100;
        int bet = 1;

        if(Math.random() < 0.5){
            stake++;
            System.out.println("You won the game total stake is ::" + stake);
        }else {
            stake--;
            System.out.println("You loose the game total stake is ::" + stake);
        }
    }
}
