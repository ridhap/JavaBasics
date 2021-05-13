/**
 * @(#)pat1.java
 *
 *
 * @author 
 * @version 1.00 2014/7/5
 */

public class pat1 {
        
 
    public static void main(String[] args) {
       int i=1,j=1,f=1;
       
       for(i=1;i<=5;i++){
      
       for(j=1;j<=i;j++){
       	if(j%2==1)
       		System.out.print(1+" ");
       		else
       		System.out.print(0+" ");	
       }
       System.out.println();
        }
    }
}
