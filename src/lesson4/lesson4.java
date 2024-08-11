package lesson4;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class lesson4 {
    public static void main(String[] args) {
        //getArray();
        //getMaxMin();
        //getIndexMaxMin();
        //getZero();
        //getSwap();
        //checkIncrease();
        addOne();
    }

    public static void getArray() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Please enter length of the array: ");
        int size = input.nextInt();
        int[] randomNumbers = new int[size];
        System.out.println("---Array in direct order---");
        for (int counter = 0; counter < size; counter++) {
            randomNumbers[counter] = random.nextInt(-10, 10);
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
        for (int counter = 0; counter < size; counter++) {
            newArray[counter] = random.nextInt(-50, 50);
        }
        System.out.print("Array: ");
        System.out.println(Arrays.toString(newArray));
        int max = newArray[0], min = newArray[0];
        for (int counter = 1; counter < size; counter++){
            if (newArray[counter]>max) max = newArray[counter];
            if (newArray[counter] < min) min = newArray[counter];
        }
        System.out.println("max element: " + max);
        System.out.println("min element: " + min);
    }

    public static void getIndexMaxMin() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Please enter length of the array: ");
        int size = input.nextInt();
        int[] newArray = new int[size];
        for (int counter = 0; counter < size; counter++) {
            newArray[counter] = random.nextInt(-50, 50);
        }
        System.out.print("Array: ");
        System.out.println(Arrays.toString(newArray));
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

        for (int counter = 0; counter < size; counter++) {
           //newArray[counter] = random.nextInt(-10, 10);
            if (newArray[counter] == 0) zeroCounter++;
        }
        System.out.print("Array: ");
        System.out.println(Arrays.toString(newArray));
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
        for (int counter = 0; counter < size; counter++) {
            initialArray[counter] = random.nextInt(-10, 10);
        }
        System.out.print("Initial array: ");
        System.out.println(Arrays.toString(initialArray));
        for (int counter = 0; counter < size; counter++) {
            newArray[counter] = initialArray[(size-1) - counter];
        }
        System.out.print("New array: ");
        System.out.println(Arrays.toString(newArray));
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
        /*for (int counter = 0; counter < size; counter++) {
            newArray[counter] = random.nextInt(-10, 10);
        }*/
        System.out.print("Array: ");
        System.out.println(Arrays.toString(newArray));
        for (int counter = 1; counter < size; counter++) {
            if (newArray[counter] < newArray[counter-1]) {
                isIncrease = false;
                break;
            }
        }
        if (isIncrease) System.out.println("The array is increasing");//если все числа равны то тоже возрастает
        else System.out.println("The array is not increasing");
    }

    public static void addOne() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Please enter length of the array: ");
        int size = input.nextInt();
        int[] newArray = new int[size];
        newArray[0] = random.nextInt(1, 9);//т.к. первый элемент > 0
        for (int counter = 1; counter < size; counter++) {
            newArray[counter] = random.nextInt(0, 9);
        }
        System.out.print("Array: ");
        System.out.println(Arrays.toString(newArray));
        int result = 0;
        for (int counter = 0, powCounter = size-1; counter < size; counter++, --powCounter) {
            int pos = (int)Math.pow(10, powCounter);
            result += newArray[counter]*pos;
        }
        result++;
        String numberString = Integer.toString(result);
        char[] charArray = numberString.toCharArray();
        for (int counter = 0; counter < size; counter++) {
           newArray[counter] = Character.getNumericValue(charArray[counter]);
        }
        System.out.print("New array: ");
        System.out.println(Arrays.toString(newArray));
    }
}
