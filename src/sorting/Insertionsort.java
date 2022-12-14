/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Jared Gamutin.
 */
import java.util.Random;

public class Insertionsort {

    Random element = new Random();

    int[] numbers = new int[10];

    public void insertionstartme() {
        for (int i = 0; i < numbers.length; i++) {
			numbers[i] = element.nextInt(100);
		}

		System.out.println("Before:");
		printArray(numbers);

		insertionSort(numbers);

		System.out.println("\nAfter:");
		printArray(numbers);
	
    }

    private static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {

            int currentValue = inputArray[i];

            int j = i - 1;
            while (j >= 0 && inputArray[j] > currentValue) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }

    public void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
