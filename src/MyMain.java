import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        System.out.print("What task do you want to do?(enter 1, 2 or 3): ");
        int choice = getScanner();
        switch (choice) {
            case 1: getTask1();
            case 2: getTask2();
            case 3: getTask3();
        }
    }

    static void getTask1() {
        int[] array = getArray();

        Thread maxThread = new ThreadMax(array);
        Thread minThread = new ThreadMin(array);
        maxThread.start();
        minThread.start();

        try {
            maxThread.join();
            minThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void getTask2() {
        int[] array = getArray();

        Thread insertionSortThread = new InsertionSortThread(array);
        Thread selectionSortThread = new SelectionSortTreads(array);
        Thread bubbleSortThread = new BubbleSortThread(array);

        insertionSortThread.start();
        selectionSortThread.start();
        bubbleSortThread.start();
    }

    public static void getTask3() {
        Store store = new Store();
        Thread producerThread = new Thread(new Producer(store));
        Thread consumerThread = new Thread(new Consumer(store));

        producerThread.start();
        consumerThread.start();
    }

    public static int[] getArray() {
        System.out.print("Please enter size of the array: ");
        int size = getScanner();
        int[] array = new int[size];

        System.out.println("Please enter elements of the array");
        for (int i = 0; i <  size; i++) {
            System.out.print("el[" + i + "]: ");
            array[i] = getScanner();
        }
        return array;
    }

    public static int getScanner() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}


