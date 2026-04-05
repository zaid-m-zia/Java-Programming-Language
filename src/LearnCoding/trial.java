package LearnCoding;
import java.util.*;    // is package ke under hota hai scanner class
// java.lang package is a default package of java which is automatically  imported in every class of java
public class trial {
    static void main(String[] args) {
        System.out.print("enter a number");
        Scanner obj = new Scanner(System.in); //system is a predefined class and in is a func in that class
        double a = obj.nextDouble();
        System.out.println(a);

    }
}
