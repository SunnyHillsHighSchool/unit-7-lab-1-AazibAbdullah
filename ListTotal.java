//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Aazib Abdullah
//Date - 1/31/2021

//______________________________________________________\\

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
 public static int total( List<Integer> ray )
 {
   // Declare a variable and set it to 0
   int sum = 0;
   // Create a for loop, and follow the ICU rule
   for (int i = 0; i < ray.size(); i++)
   {
     sum += ray.get(i);
   }
   return sum;
 }
}