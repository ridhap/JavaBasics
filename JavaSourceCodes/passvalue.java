/**
 * @(#)passvalue.java
 *
 *
 * @author 
 * @version 1.00 2014/3/7
 */

public class passvalue {
     static int k1=50,k2=75;
       
public static void sub(){
int k3;
	k3=k1;
	k1=k2;
	k2=k3;
	 //System.out.println("k1= "+k1+" k2= "+k2);
}

    public static void main(String[] args) {
       System.out.println("k1= "+k1+" k2= "+k2);
       sub();
       System.out.println("k1= "+k1+" k2= "+k2);
    }
}
