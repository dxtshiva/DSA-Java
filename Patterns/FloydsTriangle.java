package Patterns;

/* Program to print below pattern
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
 */
public class FloydsTriangle {
public static void main(String[] args) {
    int count=0, rows=5;

    for(int i=0;i<rows;i++){
        for(int j=0;j<=i;j++)
            System.out.print(++count +" ");

        System.out.println();
    }
}
    
}