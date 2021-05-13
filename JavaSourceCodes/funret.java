/**
 * @(#)funret.java
 *
 *
 * @author 
 * @version 1.00 2014/3/7
 */

public class funret {
        
    
   public static String check(int x){
		return (x%2==0)?"even":"odd";
   }
    
    public static void main(String[] args) {
        int x=58;
        System.out.println(check(x));
    }
}
