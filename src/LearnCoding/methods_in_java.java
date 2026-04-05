package LearnCoding;

public class methods_in_java {

    void disp(){                            //method definition
        System.out.println("hello world");
    }


    static void main(String[] args) {
        //calling the method in the main variable
        methods_in_java obj = new methods_in_java();  //we create the object of the class in the main method in this case
        obj.disp();
    }
}
