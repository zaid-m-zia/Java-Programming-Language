package Nptel_week_1;

public class _3D_array {
    static void main(String[] args) {
         int my3Darray [][][] = new int[3][4][5];    //declaring and allocating the array and memory at runtime
    int i,j,k;
        for( i=0;i<3;i++)     //as array indexing starts from 0 that is why we dont use i<=3
            for( j=0;j<4;j++)
                for( k=0;k<5;k++)
                    my3Darray [i][j][k] = i * j * k;
        for(i=0;i<3;i++){
            for(j=0;j<4;j++){
                for(k=0;k<5;k++){
                    System.out.print(my3Darray[i][j][k]+" ");
                }
                System.out.println();
            }
        System.out.println();
        }




    }
}
