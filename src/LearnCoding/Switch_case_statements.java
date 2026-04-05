package LearnCoding;

import java.util.Scanner;

//this is a program to learn about switch case statements
public class Switch_case_statements {
    static void main(String[] args) {
        System.out.println("enter a choice");
        Scanner obj = new Scanner(System.in);
        int choice = obj.nextInt();

        int a=2,b=4;
        switch (choice){
            case 1:
                System.out.println("SUM"+(a+b));
                break;
            case 2:
                System.out.println("SUB"+(a-b));
                break;
            case 3:
                System.out.println("DIV"+(a/b));
                break;
            case 4:
                System.out.println("MULTIPLY"+(a*b));
                break;
            default:
                System.out.println("print a valid choice");
        }

    }
}
