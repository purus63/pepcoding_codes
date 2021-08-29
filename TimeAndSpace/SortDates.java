package TimeAndSpace;

import java.util.Scanner;

public class SortDates {
    public static void sortDates(String[] arr) {

        //sort based on dates
       // countSort(arr,,,31);

        //sort based on month

        //sort based on yyyy

    }

    public static void countSort(String[] arr,int div, int mod, int range) {


    }

    public static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            String str = scn.next();
            arr[i] = str;
        }
        sortDates(arr);
        print(arr);
    }
}
