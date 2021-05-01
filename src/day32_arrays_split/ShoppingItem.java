package day32_arrays_split;

public class ShoppingItem {
    public static void main(String[] args) {


        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("----------FIND THE first of  'GLOVES' IN ITEMS ARRAY-------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " + i);
                break;
                // System.out.println(i +" - " + items[i]);
            }
        }

        System.out.println("------- Set boolean to true if first 'iPad' is found");
        boolean iPadExists = false;
        for(String item : items){
            if(item.equalsIgnoreCase("iPad")){
                iPadExists = true;
                break;
            }
        }
        System.out.println("iPadExists = " + iPadExists);
        if(iPadExists){
            System.out.println("We bought the iPad!!");
        }else {
            System.out.println("We forget the iPad!");
        }


        System.out.println("-----Print a report of each shopping item----");
        for(int i = 0; i <items.length;i++){
            System.out.println(items[i]+" - $" + prices[i] +" - #"+itemIDs[i]);

        }
        System.out.println("----Look for 'Jacket' in items and print all details -----");
        for(int i = 0; i<items.length;i++){
            if(items[i].equalsIgnoreCase("Jacket")){
                System.out.println(items[i]+" - $" + prices[i] +" - #" + itemIDs[i]);
                break;//stop searching after jacket is found
            }
        }
    }
}
