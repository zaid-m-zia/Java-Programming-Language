package LearnCoding;

import java.util.Scanner;

public class Input_output_CLASS {
    static void main(String[] args) {
        int a;
        int b;
        System.out.println("enter data");
        Scanner obj= new Scanner(System.in);
        a=obj.nextInt();
        System.out.println("enter number two");
        b=obj.nextInt();
        System.out.println("yaya answer is "+a);
        System.out.println("yay the new answer is "+b);
        System.out.println("this is the ");


    }
}
class b extends Input_output_CLASS{
    public void add(){
        System.out.println(a+b);
    }
}