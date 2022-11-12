package com.bridgelab;
//UC5 - Each month would like to know the days won and lost and by how much.
public class Gambling {
    public static void main(String[] args) {
        System.out.println("Welcome to the Gambling Simulation Problem");
        int stake = 100;
        int wonAmount = 0;

        for (int i = 0; i < 30; i++) {
            while (stake > 50 && stake < 150) {
                if (Math.random() < 0.5) {
                    stake++;
//                    System.out.println("You won the game total stake is ::" + stake);
                } else {
                    stake--;
//                    System.out.println("You loose the game total stake is ::" + stake);
                }
            }
            wonAmount += stake;
            if(i == 20){
                System.out.println("Total amount won by after 20 days :: "+wonAmount);
            }
        }
        System.out.println("Total amount won by the Month :: "+wonAmount);
    }
}
