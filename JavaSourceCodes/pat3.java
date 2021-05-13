/**
 * @(#)pat3.java
 *
 *
 * @author 
 * @version 1.00 2014/7/6
 */

public class pat3 {
        
    
    public static void main(String[] args) {
        int i=1,j=1;
        for(i=1;i<=9;i=i+2)
        {
        		for(j=i;j>=1;j=j-2)
        		System.out.print(j + " ");
        		System.out.println("");
        }
    }
}
