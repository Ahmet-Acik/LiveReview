package week09;

import java.util.Arrays;

public class R01_ArrayBinaryResearch {

    public static void main(String[] args) {


        int nums[] = {-5, 23, 123, 654, 2344, 12345, 14421};

        int indexOf = Arrays.binarySearch(nums, 23 );

        if(Arrays.binarySearch(nums, 12345) >=0 ) {
            System.out.println("12345 is in the array ");


        }
        else {
            System.out.println("12345 is not in the array" );
        }



    }
}
