/**
 * @(#)scope.java
 *
 *
 * @author 
 * @version 1.00 2014/3/7
 */

public class scope {
        
static int number=10;


public static void sub(){
	int num=200;
	    System.out.println("global Number : " + number);
        System.out.println("sub local Number : " + num);
}
    public static void main(String[] args) {
        int num=500;
        sub();
        number++;
        System.out.println("global Number : " + number);
        System.out.println("local Number : " + num);
        sub();
    }
}
