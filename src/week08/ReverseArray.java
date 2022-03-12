package week08;

import java.util.Arrays;
import java.util.Collections;

class InPlaceReversalOfArray {

    /*
        In-place Reversal Of Array
        The third method of array reversal is reversing the elements of array in-place without using a separate array. In this method, the first element of the array is swapped with the last element of the array. Similarly, the second element of the array is swapped with the second last element of the array and so on.

        This way at the end of array traversal, we will have the entire array reversed.

        The following program demonstrates in-place reversal of array.


     */


    /*swap the first element of array with the last element; second element with second last and so on*/
    static void reverseArray(int intArray[], int size)
    {
        int i, k, temp;
        for (i = 0; i < size / 2; i++) {
            temp = intArray[i];
            intArray[i] = intArray[size - i - 1];
            intArray[size - i - 1] = temp;
        }

        /*print the reversed array*/
        System.out.println("Reversed Array: \n" + Arrays.toString(intArray));
    }

    public static void main(String[] args)
    {
        int [] intArray = {11,22,33,44,55,66,77,88,99};

        //print the original array
        System.out.println("Original Array: \n" + Arrays.toString(intArray));
        //function call to reverse the array
        reverseArray(intArray, intArray.length);

        // As shown in the output, the program generates a reversed array by swapping the elements in the original array itself without using the second array.
        // This technique is more efficient as it saves memory space.
    }
}

 class ReverseAnArrayUsingTraditionalForLoop {


    /*

    Reverse An Array Using Traditional For Loop
    Yet another approach for reversing the array is to write a separate method to reverse an array in which you can have a new array and put the elements of the original array into this new array in a reverse manner.


     */
    static void reverse_array(char char_array[], int n)
    {
        char[] dest_array = new char[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            dest_array[j - 1] = char_array[i];
            j = j - 1;
        }

        System.out.println("Reversed array: ");
        for (int k = 0; k < n; k++) {
            System.out.print(dest_array[k] + " ");
        }
    }

    public static void main(String[] args)
    {
        char [] char_array = {'H','E','L','L','O'};
        System.out.println("Original array: ");
        for (int k = 0; k <char_array.length; k++) {
            System.out.print(char_array[k] + " ");
        }
        System.out.println();
        reverse_array(char_array, char_array.length);

        // Here we have used a character array as an example.
        // Using the reverse function, we reverse the array elements one by one and then display the reversed array.
    }
}


 class ReverseAnArrayUsingArrayList {
    /* Reverse An Array Using ArrayList
    Reversing an array in Java can be done using the ‘reverse’ method present in the collections framework. But for this, you first need to convert an array to a list as the ‘reverse’ method takes the list as an argument.

    The following program reverses an array using the ‘reverse’ method.

     */
    /*function reverses the elements of the array*/
    static void reverse(Integer myArray[])
    {
        Collections.reverse(Arrays.asList(myArray));
        System.out.println("Reversed Array:" + Arrays.asList(myArray));
    }

    public static void main(String[] args)
    {
        Integer [] myArray = {1,3,5,7,9};
        System.out.println("Original Array:" + Arrays.asList(myArray));
        reverse(myArray);
    }
}


 class PrintingArrayInReverseOrder {

        /*

    Printing Array In Reverse Order
    Alternatively, if we want to print the array in the reverse order, without actually reversing it, then we can do that just by providing a for loop that will start printing from the end of the array.
    This is a good option as long as we just want to print the array in reverse order without doing any processing with it.

    The following program prints the array in reverse order.


     */
    public static void main(String[] args) {
        Integer[] intArray = {10,20,30,40,50,60,70,80,90};

        //print array starting from first element
        System.out.println("Original Array:");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + "  ");

        System.out.println();

        //print array starting from last element
        System.out.println("Original Array printed in reverse order:");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");
    }
}