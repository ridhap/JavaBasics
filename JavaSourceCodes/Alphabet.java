        
import java.util.Scanner;

class Alphabet
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
char ch1,ch2;
ch1 = input.next().charAt(0);
ch2 = input.next().charAt(0);
System.out.println("Your Frist Character is: "+ch1);
System.out.println("Your Second Character is: "+ch2);
boolean flag = true;
if(ch1 == ch2)
{
System.out.println(flag);
}
else
{
flag = false;
System.out.println("Character did not match "+flag);
}
}
}
   
