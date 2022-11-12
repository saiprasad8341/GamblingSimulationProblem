package com.bridgelab;
//UC4 - After 20 days of playing every day would like to know the total amount won or lost.
public class Gambling {
    public static void main(String[] args) {
        System.out.println("Welcome to the Gambling Simulation Problem");
        int stake = 100;
        int wonAmount = 0;

        for (int i = 0; i < 20; i++) {
            while (stake > 50 && stake < 150) {
                if (Math.random() < 0.5) {
                    stake++;
                    System.out.println("You won the game total stake is ::" + stake);
                } else {
                    stake--;
                    System.out.println("You loose the game total stake is ::" + stake);
                }
            }
            wonAmount += stake;
        }
        System.out.println("Total amount won by after 20 days :: "+wonAmount);
    }
}
