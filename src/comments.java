public class comments {



// --- comments --- //

/*
/////////////////////////////////////////////////////////////////////////////
    public static class Genuine {
        boolean isGenuine = true;
        boolean isNotGenuine = false;
    }

    public static boolean GenuineLogic (){

        return(true);
    }
    Boolean product = true;

    Genuine genuineObj1 = new Genuine();
        System.out.println(genuineObj1.isGenuine);
        System.out.println(genuineObj1.isNotGenuine);

    public static boolean GenuineCheck(boolean a, boolean b){
        return ();
    }

    // Java Program to add an element in an Array
/////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    // Function to add x in arr
    public static int[] addX(int n, int[] arr, int x)
    {
        int i;

        // create a new array of size n+1
        int[] newarr = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }

    // Driver code
    public static void main(String[] args)
    {

        int n = 10;
        int i;

        // initial array of size 10
        int[] arr
                = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // print the original array
        System.out.println("Initial Array:\n"
                + Arrays.toString(arr));

        // element to be added
        int x = 50;

        // call the method to add x in arr
        arr = addX(n, arr, x);

        // print the updated array
        System.out.println("\nArray with " + x
                + " added:\n"
                + Arrays.toString(arr));
    }
}
//////////////////////////////////////////
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        int [] randomArray = new int [100];
        Random randomGenerator = new Random();

        for (int i = 0; i< randomArray.length; i++){
            randomArray[i] = randomGenerator.nextInt(100);

        }
        Scanner input = new Scanner (System.in);
        int searchNumber;
        System.out.println("Please enter a number to search for between 1 and 100: ");
        searchNumber= input.nextInt();



        boolean found = false;
        for (int i = 0; i < randomArray.length; i++){
            if (searchNumber == randomArray[i]){
                found = true;
                break;

            }

            if (found){
                System.out.println("We have found your" + "number at index " + i);
            }else{
                System.out.println("We did not find your number");
            }
        }
    }


}

 */
}
