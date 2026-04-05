package LearnCoding;
import java.util.Arrays;
import java.util.Scanner;

public class some_array_methods {
    static void main(String[] args) {
        int integer[]=new int[5];
        System.out.println("enter the size of the array");
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<integer.length;i++){
            integer[i]=obj.nextInt();
        }
        Arrays.sort(integer);
        System.out.println(Arrays.toString(integer));
        String a[] = {"learn","coding","keypoints","education"};
        // some methods of Arrays class in java in java.util package
        System.out.println("toString"+Arrays.toString(a));
        System.out.println("asList"+Arrays.asList(a));

        //there is one method for 2d arrays also deepToString()
        int arr[][]={{1,2},{3,4},{5,6}};
        System.out.println("deepToString"+Arrays.deepToString(arr));
    }
}
