//Linear search is very simple, To check if an element is present in the given list we compare search element with every element in the list. If the number is found then success occurs otherwise the list doesn't contain the element we are searching.
com.company.Main

import java.util.Scanner;
 
class LinearSearch 
{
  public static void main(String args[])
  {
    int c, n, search, array[];
 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements");
    n = in.nextInt(); 
    array = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
    for (c = 0; c < n; c++)
      array[c] = in.nextInt();
 
    System.out.println("Enter value to find");
    search = in.nextInt();
 
    for (c = 0; c < n; c++)
    {
      if (array[c] == search)     /* Searching element is present */
      {
         System.out.println(search + " is present at location " + (c + 1) + ".");
          break;
      }
   }
   if (c == n)  /* Searching element is absent */
      System.out.println(search + " is not present in array.");
  }
}