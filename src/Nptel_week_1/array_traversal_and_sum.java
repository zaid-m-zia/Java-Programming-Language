package Nptel_week_1;

public class array_traversal_and_sum {
    static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};       //initialization
        //traversing an array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        //average calculation
        float sum = 0;
        float avg;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            }
            avg = sum / a.length;
            System.out.println("average = " + avg);


    }
}
