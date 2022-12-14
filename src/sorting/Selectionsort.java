/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Random;

/**
 *
 * @author Jared Gamutin
 */
public class Selectionsort {

    Random element = new Random();

    int[] numbers = new int[10];


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
 
     private static void selectionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length - 1; i++) {
             int min = i;
             for(int j = i +1;j<inputArray.length; j++){
                 if (inputArray[min]> inputArray[j]){
                     min = j;
                 }
                 
             }
           int temp = inputArray[i];
           inputArray[i] = inputArray [min];
           inputArray[min] = temp;

        }
    }
    public void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }}
