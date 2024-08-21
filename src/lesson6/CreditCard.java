package lesson6;

public class CreditCard {
    long accountNumber;
    int amountOfMoney;

    CreditCard(long accountNumber, int amountOfMoney){
        this.accountNumber = accountNumber;
        this.amountOfMoney = amountOfMoney;
    }

    void addCredit(int credit){
        amountOfMoney += credit;
        System.out.println("You have put " + credit +
        " BYN on the card with the number: " + this.accountNumber);
    }

    void withdrawMoney(int withdrawnMoney){
        if (withdrawnMoney > amountOfMoney)
            System.out.println("There is not enough money on the card");
        else {
            System.out.println("You have withdrawn " + withdrawnMoney +
            " BYN from the card with the number: " + this.accountNumber);
            amountOfMoney -= withdrawnMoney;
        }
    }

    String getInfo(){
       return "-----------------------------"+ "\n" +
               "Account number: " + this.accountNumber + "\n" +
               "Current balance: " + this.amountOfMoney;
    }
}
