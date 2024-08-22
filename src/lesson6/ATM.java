package lesson6;

public class ATM {
    int numberOfBanknote20;
    int numberOfBanknote50;
    int numberOfBanknote100;
    int balance;

    ATM(int numberOfBanknote20, int numberOfBanknote50, int numberOfBanknote100){
        this.numberOfBanknote20 = numberOfBanknote20;
        this.numberOfBanknote50 = numberOfBanknote50;
        this.numberOfBanknote100 = numberOfBanknote100;
        balance += (20 * numberOfBanknote20 + 50 * numberOfBanknote50 + 100 * numberOfBanknote100);
    }

    void addMoney(int numberOfBanknote20, int numberOfBanknote50, int numberOfBanknote100) {
        numberOfBanknote20 += numberOfBanknote20;
        numberOfBanknote50 += numberOfBanknote50;
        numberOfBanknote100 += numberOfBanknote100;
        balance += (20 * numberOfBanknote20 + 50 * numberOfBanknote50 + 100 * numberOfBanknote100);
    }

    boolean withdrawMoney(int withdrawnMoney) {
        if (withdrawnMoney > balance) {
            System.out.println("There is not enough money on the ATM");
            return false;
        } else if (withdrawnMoney % 20 != 0 && withdrawnMoney % 50 != 0) {
            System.out.println("There are no such banknotes in the ATM");
            return false;
        } else {
            balance -= withdrawnMoney;
            do {
                if (withdrawnMoney / 100 < numberOfBanknote100 && withdrawnMoney / 100 != 0) {
                    int temp = withdrawnMoney / 100;
                    numberOfBanknote100 -= temp;
                    withdrawnMoney = withdrawnMoney % 100;
                    System.out.println("Banknotes 100: " + temp);
                }
                if (withdrawnMoney / 50 < numberOfBanknote50 && withdrawnMoney / 50 != 0) {
                    int temp = withdrawnMoney / 50;
                    numberOfBanknote100 -= temp;
                    withdrawnMoney = withdrawnMoney % 50;
                    System.out.println("Banknotes 50: " + temp);
                }
                if (withdrawnMoney / 20 < numberOfBanknote20 && withdrawnMoney / 20 != 0) {
                    int temp = withdrawnMoney / 20;
                    numberOfBanknote100 -= temp;
                    withdrawnMoney = withdrawnMoney % 20;
                    System.out.println("Banknotes 20: " + temp);
                }
            } while (withdrawnMoney != 0);
            return true;
        }
    }
}

