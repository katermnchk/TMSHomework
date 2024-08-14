package lesson5;

import java.util.Random;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        //getSum();
        //colorChessboard();
        printSnakeArray();
    }

    //Task 1
    public static void getSum(){
        int[][] multidimensionalArray = setArray();
        System.out.println("Array: ");
        showArray(multidimensionalArray);
        System.out.print("Please enter the number that will be added to the array elements: ");
        int number = getScanner().nextInt();
        int sum = 0;
        for (int outer = 0; outer < multidimensionalArray.length; outer++) {
            for (int inner = 0; inner < multidimensionalArray[outer].length; inner++){
                multidimensionalArray[outer][inner] += number;
                sum+=multidimensionalArray[outer][inner];
            }
        }
        System.out.println("New array: ");
        showArray(multidimensionalArray);
        System.out.println("Sum of the new array elements: " + sum);
    }

    //Task 2
    public static void colorChessboard(){
        String[][] chessBoard = new String[8][8];
        for (int outer = 0; outer < chessBoard.length; outer++){
            for (int inner = 0; inner < chessBoard[outer].length; inner++){
                if ((outer+inner)%2 == 0) chessBoard[outer][inner] = "W";
                else chessBoard[outer][inner] = "B";
            }
        }
        showArray(chessBoard);
    }

    //Task *
    public static void printSnakeArray(){
        int[][] snakeArray = setSnakeArray();
        for (int outer = 0; outer < snakeArray.length; outer++){
            if (outer%2==0) {
                for (int inner = 0; inner < snakeArray[outer].length; inner++) {
                    System.out.print(snakeArray[outer][inner] + " ");
                }
            }
            else {
                for (int inner = snakeArray[outer].length-1; inner >= 0; inner--) {
                    System.out.print(snakeArray[outer][inner]+ " ");
                }
            }
            System.out.println();
        }
    }

    public static int[][] setArray(){
        System.out.print("Please enter a number of rows: ");
        int rows = getScanner().nextInt();
        System.out.print("Please enter a number of columns: ");
        int columns = getScanner().nextInt();
        int[][] numbers = new int[rows][columns];
        for (int outer = 0; outer < numbers.length; outer++){
            for (int inner = 0; inner < numbers[outer].length; inner++){
                numbers[outer][inner] = new Random().nextInt(-50, 50);
            }
        }
        return numbers;
    }

    public static int[][] setSnakeArray(){
        System.out.print("Please enter a number of rows: ");
        int rows = getScanner().nextInt();
        System.out.print("Please enter a number of columns: ");
        int columns = getScanner().nextInt();
        int[][] numbers = new int[rows][columns];
        for (int outer = 0, counter = 0; outer < numbers.length; outer++){
            for (int inner = 0; inner < numbers[outer].length; inner++, counter++){
                numbers[outer][inner] = counter;
            }
        }
        return numbers;
    }

    public static void showArray(int[][] shownArray){
        for (int[] outer: shownArray){
            for (int inner: outer){
                System.out.print(inner + "  ");
            }
            System.out.println();
        }
    }

    public static void showArray(String[][] shownArray){
        for (String[] outer: shownArray){
            for (String inner: outer){
                System.out.print(inner + "  ");
            }
            System.out.println();
        }
    }

    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
}
