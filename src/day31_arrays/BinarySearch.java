package day31_arrays;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
                   // 0    1    3
        int[] nums = {-5, 23, 123, 654, 2344,12345,14421};
        System.out.println(Arrays.binarySearch(nums, 23));//0
        System.out.println(Arrays.binarySearch(nums, 2344));//3
        System.out.println(Arrays.binarySearch(nums, 25));//-2
        System.out.println(Arrays.binarySearch(nums, 700));//-4
        System.out.println(Arrays.binarySearch(nums, -5));//0

        //check if number 12345 is among number in array

        if(Arrays.binarySearch(nums,12345) >=0){
            System.out.println("12345 is present in array");
        }else{
            System.out.println("12345 is not present");

        }

    }
}
