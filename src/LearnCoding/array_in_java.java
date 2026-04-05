package LearnCoding;

public class array_in_java {
    static void main(String[] args) {
        //way 1
        int a []; //this is how we declare an array
        a= new int [5];
        a[0]=1;
        a[1]=2;
        a[2]=3;   //storing stuff in the array
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }
        //way 2
        int b[] = new int [5];
        //way 3
        int c[]={0,1,2,3,4}; //automatically size = 5
    }
}
