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

public class Bubblesort {

Random element = new Random();

int [] numbers = new int [10];

public void bubblestartme(){
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = element.nextInt(100);
    }
    
    System.out.println("Before:");
    printArray(numbers);
    

    boolean swappedfine = true;
    
    while (swappedfine) {
      swappedfine = false;
      
      for (int i = 0; i < numbers.length - 1; i++) {
        if (numbers[i] > numbers[i + 1]) {
          swappedfine = true;
          int temp = numbers[i];
          numbers[i] = numbers[i + 1];
          numbers[i + 1] = temp;
        }
      }
    
    System.out.println("\nAfter:");
    printArray(numbers);
  
}}
 public void printArray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
    
    
}
