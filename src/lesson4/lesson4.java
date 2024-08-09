package lesson4;

import java.util.Random;
import java.util.Scanner;

public class lesson4 {
    public static void main(String[] args) {
        //getArray();
        //getMaxMin();
        //getIndexMaxMin();
        //getZero();
        //getSwap();
        //checkIncrease();
    }

    public static void getArray() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Please enter length of the array: ");
        int size = input.nextInt();
        int[] randomNumbers = new int[size];
        System.out.println("---Array in direct order---");
        for (int counter = 0; counter < size; counter++) {
            randomNumbers[counter] = random.nextInt();
            System.out.println("Element [" + (counter+1) + "]: " + randomNumbers[counter]);
        }
        System.out.println();
        System.out.println("---Array in reverse order---");
        for (int counter = size; counter > 0; counter--) {
            System.out.println("Element [" + counter + "]: " + randomNumbers[counter-1]);
        }
    }

    public static void getMaxMin() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Please enter length of the array: ");
        int size = input.nextInt();
        int[] newArray = new int[size];
        System.out.print("Array: [");
        for (int counter = 0; counter < size; counter++) {
            newArray[counter] = random.nextInt(-50, 50);
            System.out.print(newArray[counter] + " ");
        }
        int max = newArray[0], min = newArray[0];
        for (int counter = 1; counter < size; counter++){
            if (newArray[counter]>max) max = newArray[counter];
            if (newArray[counter] < min) min = newArray[counter];
        }
        System.out.println("]");
        System.out.println("max element: " + max);
        System.out.println("min element: " + min);
    }

    public static void getIndexMaxMin() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Please enter length of the array: ");
        int size = input.nextInt();
        int[] newArray = new int[size];
        System.out.print("Array: [");
        for (int counter = 0; counter < size; counter++) {
            newArray[counter] = random.nextInt(-50, 50);
            System.out.print(newArray[counter] + " ");
        }
        System.out.println("]");
        int max = newArray[0], min = newArray[0], maxIndex = 0, minIndex = 0;
        for (int counter = 1; counter < size; counter++){
            if (newArray[counter] > max) {
                max = newArray[counter];
                maxIndex = counter;
            }
            if (newArray[counter] < min) {
                min = newArray[counter];
                minIndex = counter;
            }
        }
        System.out.println("max element " + max + " has the index: " + (maxIndex+1));
        System.out.println("min element " + min + " has the index: " + (minIndex+1));
    }

    public static void getZero() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Please enter length of the array: ");
        int size = input.nextInt();
        int[] newArray = new int[size];
        int zeroCounter = 0;
        //just for checking
        for (int counter = 0; counter < size; counter++) {
            System.out.print("Element " + (counter + 1) + " : ");
            newArray[counter] = input.nextInt();
        }

        System.out.print("Array: [");
        for (int counter = 0; counter < size; counter++) {
           //newArray[counter] = random.nextInt(-10, 10);
            System.out.print(newArray[counter] + " ");
            if (newArray[counter] == 0) zeroCounter++;
        }
        System.out.println("]");
        if (zeroCounter == 0) System.out.println("There are no zeros in the array");
        else if (zeroCounter == 1) System.out.println("There is " + zeroCounter + " zero in the array");
        else System.out.println("There are " + zeroCounter + " zeros in the array");
    }

    public static void getSwap() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Please enter length of the array: ");
        int size = input.nextInt();
        int[] initialArray = new int[size];
        int[] newArray = new int[size];
        System.out.print("Initial array: [");
        for (int counter = 0; counter < size; counter++) {
            initialArray[counter] = random.nextInt(-10, 10);
            System.out.print(initialArray[counter] + " ");
        }
        System.out.println("]");
        System.out.print("New array: [");
        for (int counter = 0; counter < size; counter++) {
            newArray[counter] = initialArray[(size-1) - counter];
            System.out.print(newArray[counter] + " ");
        }
        System.out.println("]");
    }

    public static void checkIncrease() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Please enter length of the array: ");
        int size = input.nextInt();
        int[] newArray = new int[size];
        boolean isIncrease = true;
        //just for checking
        for (int counter = 0; counter < size; counter++) {
            System.out.print("Element " + (counter + 1) + " : ");
            newArray[counter] = input.nextInt();
        }
        System.out.print("Array: [");
        for (int counter = 0; counter < size; counter++) {
            //newArray[counter] = random.nextInt(-10, 10);
            System.out.print(newArray[counter] + " ");
        }
        System.out.println("]");
        for (int counter = 1; counter < size; counter++) {
            if (newArray[counter] < newArray[counter-1]) {
                isIncrease = false;
                break;
            }
        }
        if (isIncrease) System.out.println("The array is increasing");//если все числа равны то тоже возрастает
        else System.out.println("The array is not increasing");
    }
}
