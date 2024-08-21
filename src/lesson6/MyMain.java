package lesson6;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        //getFirstTask();
        //testATM();
    }

    public static void getFirstTask() {
        CreditCard firstCard = new CreditCard(
                4445_0345_0322_4345l, 6000);
        CreditCard secondCard = new CreditCard(
                4456_2234_3879_6009l, 3500);
        CreditCard thirdCard = new CreditCard(
                9032_7895_3452_3456l, 5000);
        testFirstTask(firstCard, secondCard, thirdCard);
    }

    public static void testFirstTask(
            CreditCard firstCard, CreditCard secondCard, CreditCard thirdCard) {
        firstCard.addCredit(450);
        secondCard.addCredit(360);
        thirdCard.withdrawMoney(700);
        System.out.println(firstCard.getInfo());
        System.out.println(secondCard.getInfo());
        System.out.println(thirdCard.getInfo());
    }

    public static void testATM() {
        ATM testingATM = new ATM(
                20, 13, 9
        );
        int withdrawnMoney;
        do {
        System.out.print("Please enter amount of money " +
                "you want to withdraw or -1 to exit: ");
        withdrawnMoney = getScanner().nextInt();
        if (withdrawnMoney == -1) {
            System.out.println("You have entered -1. Goodbye!");
        }
        else{
            testingATM.withdrawMoney(withdrawnMoney);
            System.out.println("-----------------------------");
        }
        } while (withdrawnMoney != -1);
    }

    public static Scanner getScanner(){
        return new Scanner(System.in);
    }

}