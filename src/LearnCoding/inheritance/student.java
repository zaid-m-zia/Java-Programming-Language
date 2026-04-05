package LearnCoding.inheritance;
//this is code for simple inheritance
import java.util.Scanner;

class student {
    static int roll;
    static String Name;

    void input(){
        System.out.println("enter your roll");
        Scanner a = new Scanner(System.in);
        roll = a.nextInt();
        System.out.println("enter your name");
        Scanner b= new Scanner(System.in);
        Name = b.nextLine();
    }
}

class Ankit extends student {

    public static void output(){
        System.out.println("your roll is "+ roll);
        System.out.println("your name is "+Name);
    }

    public static void main(String[] args) {
        Ankit ref = new Ankit();  // object uska banayenge jisko inheritance me sub man rhe hai
        ref.input();              // using object we can use the functions in super class
        output();              // and if the func is in sub class only then aise hi karlo

    }
}
