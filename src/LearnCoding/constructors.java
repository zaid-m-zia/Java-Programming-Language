package LearnCoding;

public class constructors {

    //a special method with no return type and same as the class name
    int a;
    String b;
    constructors(){
         a = 9; b = "zaid";
    }
    void show(){
        System.out.println(a+" "+b);
    }

    static void main(String[] args) {
        constructors ref = new constructors();
        ref.show();             // as we can see we didnt even call the constructor but it was called on its own
    }
}


// one more example of constructor self tried
class ola {
    ola() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        ola obj = new ola();  // constructor is called here
    }
}
