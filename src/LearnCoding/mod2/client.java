package LearnCoding.mod2;
import java.util.*;
// interface methods

public interface client {
    void input(); //by default public + abstract
    void output(); // so that the developer can implement this outside the interface

}
class raju implements client{
    String name; double sal;
    @Override
    public void input(){
        System.out.println("enter name : ");
        Scanner obj = new Scanner(System.in);
        name = obj.next();

        System.out.println("enter salary");
        sal = obj.nextDouble();
    }
    @Override
    public void output(){
        System.out.println("your name is "+name);
        System.out.println("your salary is "+sal);
    }

    static void main(String[] args) {
        client ref = new raju();
        ref.input();
        ref.output();
    }

}