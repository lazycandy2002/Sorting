/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author Jared Gamutin
 */
public class Sorting {

    static Bubblesort bubbleme = new Bubblesort();
    static Insertionsort insertionme = new Insertionsort();
    static Selectionsort selectme = new Selectionsort();
    static Scanner reply = new Scanner(System.in);
    static int a, b,c;

    public static void main(String[] args) {
        start();
    }

    public static void start() {

        System.out.println("Select : 1. Bubble Sort");
        System.out.println("         2. Insertion Sort");
        System.out.println("         3. Selection Sort");
        filter_1();
    }

    static void filter_1() {
        int reply_a = reply.nextInt();
        a = reply_a;
        switch (a) {
            case 1:
                case1_1();
                break;
            case 2:
                case2_2();
                break;
            case 3:
                case3_3();
                break;

        }
    }

    static void case1_1() {
        System.out.println("");
        System.out.println("BUBBLE SORT");
        System.out.println("Select :  1. Start random ");
        System.out.println("          2. Insert Element");
        System.out.println("          3.Exit ");
        int reply_aa = reply.nextInt();
        b = reply_aa;

        switch (b) {
            case 1:
                bubbleme.bubblestartme();
                case1_1();
                break;
            case 2:
                bubbleme.start();
                break;
            case 3:
                start();
                break;
            default:
                System.out.println("Invalid Keyword:");
                System.out.println("");
                case1_1();
                break;

        }
    }

    static void case2_2() {
        System.out.println("");
        System.out.println("INSERTION SORT");
        System.out.println("Select :  1. Start random ");
        System.out.println("          2. Insert Element");
        System.out.println("          3.Exit ");
        int reply_aa = reply.nextInt();
        b = reply_aa;

        switch (b) {
            case 1:
                insertionme.insertionstartme();
                case2_2();
                break;
            case 2:
                insertionme.start();
                break;
            case 3:
                start();
                break;
            default:
                System.out.println("Invalid Keyword:");
                System.out.println("");
                case2_2();
                break;

        }

    }

    static void case3_3() {
        System.out.println("");
        System.out.println("SELECTION SORT");
        System.out.println("Select :  1. Start random ");
        System.out.println("          2. Insert Element");
        System.out.println("          3.Exit ");
        int reply_aa = reply.nextInt();
        c = reply_aa;

        switch (c) {
            case 1:
                selectme.selecttionstartme();
                case3_3();
                break;
            case 2:
                selectme.start();
                break;
            case 3:
                start();
                break;
            default:
                System.out.println("Invalid Keyword:");
                System.out.println("");
                case3_3();
                break;

        }

    }
}
