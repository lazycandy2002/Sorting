/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jared Gamutin
 */
public class Selectionsort {

    public static int a;
    Sorting back = new Sorting();
    static Scanner reply = new Scanner(System.in);
    static Scanner reply_0 = new Scanner(System.in);
    static Scanner reply_1 = new Scanner(System.in);
    Random element = new Random();

    int[] numbers = new int[10];
    int head;
    int tail;
    int capacity = 10;
    int istack[];

    Selectionsort() {
        head = 0;
        tail = -1;
        istack = new int[capacity];
    }

    public void selecttionstartme() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = element.nextInt(100);
        }

        System.out.println("Before:");
        printArray(numbers);

        selectionSort(numbers);

        System.out.println("\nAfter:");
        printArray(numbers);

    }

    public void manselecttionstartme() {

        System.out.println("Before:");
        printArray(istack);

        manselectionSort();

        System.out.println("\nAfter:");
        printArray(istack);

    }

    private static void selectionSort(int[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[min] > inputArray[j]) {
                    min = j;
                }

            }
            int temp = inputArray[i];
            inputArray[i] = inputArray[min];
            inputArray[min] = temp;

        }
    }

    private void manselectionSort() {
        for (int i = 0; i < istack.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < istack.length; j++) {
                if (istack[min] > istack[j]) {
                    min = j;
                }

            }
            int temp = istack[i];
            istack[i] = istack[min];
            istack[min] = temp;

        }
    }

    public void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void manprintArray() {
        for (int i = 0; i < istack.length; i++) {
            System.out.println(istack[i]);
        }
    }
    
      void peek() {
        if (head == -1 && tail == -1) {
            System.out.println("There is no element inside the queue to display");
        } else {
            System.out.println("The element at the Front Node is : " + istack[head]);

        }
    }

    boolean isNull() {
        return head == -1 && tail == -1;
    }

    boolean isfull() {
        return tail == capacity - 1;
    }

    void Enqueue(int data) {
        if (tail == capacity - 1) {
            System.out.println("You have reach the maximum limit");
            return;
        }
        if (head == -1 && tail == -1) {
            head = 0;
            tail = 0;
        } else {
            tail = tail + 1;
        }
        istack[tail] = data;

    }

    void Dequeue() {
        if (head == -1 && tail == -1) {
            System.out.println("Queue is Empty");
            return;
        } else if (tail == head) {
            head = tail = -1;
        } else {
            head = head + 1;
        }

    }

    void headandtail() {
        if (isNull()) {
            System.out.println("The Head is null");
            System.out.println("The Tail is null");
        } else {
            System.out.println("The Head is " + istack[head]);
            System.out.println("The Tail is " + istack[tail]);
        }
    }

    void display() {
        if (head == -1) {
            System.out.println("The Queue is Empty");
        } else {
            for (int i = head; i <= tail; i++) {
                System.out.println(" [ " + istack[i] + " ]");
            }
        }
    }

    public void start() {
        System.out.println("--------------------------------");
        display();
        System.out.println("--------------------------------");
        System.out.println("");
        isfull();
        isNull();
        System.out.println("");
        System.out.println("Press 1. Insert Element into the Queue");
        System.out.println("      2. Delete Element into the Queue");
        System.out.println("      3. Start Selection Sort");
        System.out.println("      4. Exit");
        System.out.println("");
        filter_1();

    }

    void filter_1() {
        int reply_a = reply.nextInt();
        a = reply_a;
        switch (a) {

            case 1:

                System.out.println("Enter any Numbers:");
                int reply_b = reply_0.nextInt();
                Enqueue(reply_b);
                start();
                break;
            case 2:

                System.out.println("");
                System.out.println("Y/N?:");
                String reply_c = reply_1.nextLine();

                switch (reply_c) {

                    case "Y":
                        Dequeue();
                        start();
                    case "N":
                        start();
                    default:
                        System.out.println("INVALID, TRY AGAIN");
                        filter_1();
                        break;
                }
            case 3:
                manselecttionstartme();
                start();
                break;
                
            case 4:
                back.case3_3();
                
            default:
                System.out.println("INVALID, TRY AGAIN");
                filter_1();
                break;

        }
    }
}


