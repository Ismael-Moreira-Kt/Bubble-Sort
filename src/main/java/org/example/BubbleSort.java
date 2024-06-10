package org.example;

import java.util.ArrayList;
import java.util.Scanner;



public class BubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        insertDataIntoAnArray(array);

        bubbleSort(array);

        System.out.println("Sorted Array: ");
        printArray(array);
    }



    private static void insertDataIntoAnArray(ArrayList<Integer> array) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("-> ");
            String userInput = scanner.next();

            try {
                int number = Integer.parseInt(userInput);
                array.add(number);
            }
            catch (NumberFormatException exception) {
                break;
            }
        }
    }


    private static void bubbleSort(ArrayList<Integer> array) {
        int firstNumber, secondNumber;
        int temp;
        boolean swap;

        for (firstNumber = 0; firstNumber < array.size() - 1; firstNumber ++) {
            swap = false;

            for (secondNumber = 0; secondNumber < array.size() - firstNumber - 1; secondNumber ++) {
                if(array.get(secondNumber) > array.get(secondNumber + 1)) {
                    temp = array.get(secondNumber);

                    array.set(secondNumber, array.get(secondNumber + 1));
                    array.set(secondNumber + 1, temp);

                    swap = true;
                }
            }

            if (!swap) {
                break;
            }
        }
    }



    public static void printArray(ArrayList<Integer> array) {
        for(int num : array) {
            System.out.println(num);
        }
    }

}