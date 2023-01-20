/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Jared Gamutin
 */
import java.util.Random;
import java.util.Scanner;

public class Bubblesort {

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

    Bubblesort() {
        head = -1;
        tail = -1;
        istack = new int[capacity];
    }

    public void bubblestartme() {

        System.out.println("Before:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = element.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");
        int n = numbers.length;
        int temp = 0;
        int num = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 1; j < (n - i); j++) {

                if (numbers[j - 1] > numbers[j]) {
                    //swap elements  
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }

            }
            System.out.println("");
            System.out.println("Attempt: " + num);
            for (int g = 0; g < numbers.length; g++) {
                System.out.print(numbers[g] + " ");
            }
            System.out.println("\n");
            num++;
        }
        System.out.println("After");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");
    }

    public void manbubblestartme() {

        System.out.println("Before : ");
        for (int i = 0; i < istack.length; i++) {
            System.out.print(istack[i] + " ");
        }
        System.out.println("");
        int n = istack.length;
        int temp = 0;
        int num = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 1; j < (n - i); j++) {

                if (istack[j - 1] > istack[j]) {
                    //swap elements  
                    temp = istack[j - 1];
                    istack[j - 1] = istack[j];
                    istack[j] = temp;
                }

            }
            System.out.println("");
            System.out.println("Attempt: " + num);
            for (int g = 0; g < istack.length; g++) {
                System.out.print(istack[g] + " ");
            }
            System.out.println("\n");
            num++;
        }
        System.out.println("After");
        for (int i = 0; i < istack.length; i++) {
            System.out.print(istack[i] + " ");
        }
        System.out.println("");
    }

    public void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void manprintArray(int[] numbers) {
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
        System.out.println("");
        if (head == -1) {
            System.out.println("The Queue is Empty");
        } else {
            for (int i = 0; i < istack.length; i++) {
                System.out.print( istack[i] + " ");

            }
            System.out.println("");
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
        System.out.println("      3. Start Bubble sorting");
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
                manbubblestartme();
                start();
                break;

            case 4:
                back.case1_1();

            default:
                System.out.println("INVALID, TRY AGAIN");
                filter_1();
                break;

        }
    }
}
