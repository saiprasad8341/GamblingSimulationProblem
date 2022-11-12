package com.bridgelab;
//UC3 - As a Calculative Gambler if won or lost 50% of the stake, would resign for the day
public class Gambling {
    public static void main(String[] args) {
        System.out.println("Welcome to the Gambling Simulation Problem");
        int stake = 100;
//        int bet = 1;

        while (stake > 50 && stake < 150) {
            if (Math.random() < 0.5) {
                stake++;
                System.out.println("You won the game total stake is ::" + stake);
            } else {
                stake--;
                System.out.println("You loose the game total stake is ::" + stake);
            }
        }
    }
}
