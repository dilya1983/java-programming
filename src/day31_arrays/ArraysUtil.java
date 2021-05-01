package day31_arrays;
import java.util.Arrays;
import java.util.Collections;


public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {100,5,1,7,0,-4,44,33};
         //print all nums is same line
        System.out.println(Arrays.toString(nums));

        //sort nums.re-arrange values in ascending order
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length-1]);

        String[] word = {"Java", "C#", "C++", "Kotlin","Python","Ruby","assembly"};
        System.out.println(Arrays.toString(word));
        System.out.println("["+String.join(", ",word)+ "]");

        //sort word in alphabetic and ASCII table
        Arrays.sort(word);
        System.out.println(Arrays.toString(word));

        //short word in reverse order
        Arrays.sort(word, Collections.reverseOrder());

        System.out.println(Arrays.toString(word));



    }
}
