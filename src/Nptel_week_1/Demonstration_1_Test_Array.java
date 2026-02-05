package Nptel_week_1;

public class Demonstration_1_Test_Array {
    static void main(String[] args) {
        int a[] = {10,20,30,40,50};       //initialization
        //traversing an array
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        //average calculation
        float sum = 0, avg;
        for (int j = 0;j < a.length; j++){
            sum += a[i];
            avg= sum/a.length;
            System.out.println("average = "+avg);

        }

        }
    }
}
