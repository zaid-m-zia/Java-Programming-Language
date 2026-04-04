package LearnCoding;


public class Static_Methods {

     public static void show(){
        System.out.println("this is show method");
    }

    public void show2(){
        System.out.println("this is show2 method");
    }
     public static void main(String[] args) {
        Static_Methods.show();

        Static_Methods ref= new Static_Methods();   //reference variable ref
        ref.show2();
        System.out.println("my name is zaid");
    }
}
