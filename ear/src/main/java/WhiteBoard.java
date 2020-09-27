import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class WhiteBoard {

    public static void main(String[] args) {

        //1. Create method which ascepts Array and returns sum o all the elements in array
        int[] num = {3, 5, 0, 1, 4};//13
        System.out.println(sumOfAllElementsInArray(num));

        //2. Print multiplacation table without using Multiply operator
        int a = 5, b = 7;
        System.out.println(multiplyWithoutStar(a, b));

        //3. Max difference between any adjacent index in array
        int[] num2 = {3, 20, 2, 12, 6};// 2, 3, 10, 6 ; 18
        System.out.println(maxAdjDifference(num2));

        //4. compare same indexes of 2 different arrays and create new array for matchValues
        int[] one = {2, 6, 6, 7, 2, 909};
        int[] two = {34, 6, 6, 909, 2, 4}; //{6, 2}
        System.out.println(Arrays.toString(matchingArrays(one, two)));

        //5. Sort the array in ascending and descending order
        int[] num3 = {2, 4, 7, 3, 4, 1}; //{1, 2, 3, 4, 4, 7}
        Arrays.sort(num3);
        System.out.println("Ascending order: " + Arrays.toString(num3));
        ArrayList<Object> descending = new ArrayList<Object>();
        for (int i = num3.length - 1; i >= 0; i--) {
            descending.add(num3[i]);
        }
        Integer[] desc = descending.toArray(new Integer[0]);
        System.out.println("Descending order: " + Arrays.toString(desc));

        //6. Swap the variables with and wtihout using Temp variable
        int x = 5;
        int y = 2;

        x = x + y;//5 + 2 = 7
        y = x - y;//7 - 2 = 5
        x = x - y;//7-5 = 2
        System.out.println("x = " + x + " y = " + y);

        //7. Program for Printing Pyramid Pattern in Java
        //*
        //* *
        //* * *
        //* * * *
        String pyramid = "* ";
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(pyramid);
            }
            System.out.println();
        }
        //8. print Febanocci Series by swapping variables
        //Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
        int fibSer = 8;
        System.out.println(fibonacciRecurcive(fibSer));
        System.out.println(fibSeq(fibSer));
        System.out.println("Bla bla bla");
        System.out.println("Ha ha ha");
        System.out.println("Im a truck driver tram tram tram");
    }

    public static int fibonacciRecurcive(int a) {

        if (a <= 1) return a;
        else return fibonacciRecurcive(a - 1) + fibonacciRecurcive(a - 2);
    }

    //Fibonacci Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    public static int fibSeq(int a) {
        int x = 1, y = 0, result = 0;
        for (int i = 0; i < 8; i++) {
            result = x + y;
            x = y;
            y = result;
        }
        return result;
    }

    public static int sumOfAllElementsInArray(int[] ar) {
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }

    public static int multiplyWithoutStar(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }
        return sum;
    }

    public static int maxAdjDifference(int[] a) {
        int difA = 0, difB = 0;
        for (int i = 0; i < a.length - 1; i++) {
            difA = a[i] - a[i + 1];
            difB = Math.max(Math.abs(difA), difB);
        }
        return difB;
    }

    public static Integer[] matchingArrays(int[] a, int[] b) {
        ArrayList<Integer> ab = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) ab.add(a[i]);
        }
        Integer[] match = ab.toArray(new Integer[0]);
        return match;
    }


}
