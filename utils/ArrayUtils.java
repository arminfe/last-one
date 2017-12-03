package utils;



public class ArrayUtils {

    public static String reverse(int arr[]) {
        String reversed="";
        for (int q =arr.length-1 ; q >=0 ; q = q - 1) {
        reversed=reversed + arr[q];
        
        }

        return reversed;
    }




    public static String stringifyArray(int[] arr){
        String newString="";
        for(int w=0 ; w< arr.length ; w=w+1){
            newString=newString + arr[w] + ",";

        }
        return newString;
    }






}
