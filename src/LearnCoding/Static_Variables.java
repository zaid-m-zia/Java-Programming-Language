package LearnCoding;

public class Static_Variables {
    static int b= 89; //this is called a static variable hence no need to make object for this
    int c= 30; // this is an instance variable this is outside the method without static word so object is necessary
    static void main(String[] args) {
        int a= 10; //local variable
        System.out.println(a);
        System.out.println(Static_Variables.b);
        Static_Variables ref = new Static_Variables(); //this is a reference of the class Static_Variables.
        System.out.println(ref.c);  //instance variables will be accessed using object ref name not class name

    }
}
