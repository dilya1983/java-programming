package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        String catsTypes = "bengal cat tabby cat persian cat no cat here some other cat type";
        String[] catArray = catsTypes.split("cat");
        System.out.println("number of 'cat' = " + (catArray.length - 1));

        for (String type : catArray) {
            System.out.println(type);
        }
        /** int count = 0;
         for(int i = 0; i < cats.length() - 2; i++) {
         if(cats.substring(i, i +3).equals("cat")) {
         count++;
             }
         }
         System.out.println("count of cats = " + count);
         */

        }
    }


