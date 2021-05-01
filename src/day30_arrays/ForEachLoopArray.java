package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        //            0    1   2   3    4    5   6    7    8   9 10
        int[] data = {32, 532, 1, 5454, 22, 123,543, 999, 321,3};

        for( int eachNum : data){
            System.out.println(eachNum);
        }

        for(int n : data){
            System.out.println(n + " ");
        }
        System.out.println("=========== FOR LOOP ============");
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }
        //print last value in array using length - 1
                                   // 10 - 1 = 9
        System.out.println(data[data.length-1]);

        for(int i = data.length-1; i >= 0; i-- ){
            System.out.print(data[i]+" ");
        }

    }
}
