package com.practice;

import java.util.Scanner;

public class DuplicateValues
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String s = in.next();
      String rest = s;
      String result = "";
      int i = 0;
      while (rest.length() > 0)
      {
         
         String first = rest.substring(0, 1);
         rest = rest.substring(1);
         ++i;
         if (rest.contains(first)) 
         {
        	 first = new String(new char[i]).replaceAll("%s", first);
        	 result += first;
         }
      }
      System.out.println(result);
   }
}