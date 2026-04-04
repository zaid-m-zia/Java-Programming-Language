package Nptel_week_2;

import static java.lang.IO.println;

public class Encapsulation {
        static class circle{
            double x,y; //coordinates of center
            double r;  //radius

            //creating methods
            double circumference(){
                return 2*3.14*r;
            }
            double Area(){
                return (22/7)*r*r;
            }
        }
        static void main(String[] args) {
            circle cc = new circle();
            cc.x = 0.0;
            cc.y = 0.0;
            cc.r = 5.0;
            System.out.println("circumference"+cc.circumference());
            println("area"+cc.Area());
            println("hello");


    }
}
