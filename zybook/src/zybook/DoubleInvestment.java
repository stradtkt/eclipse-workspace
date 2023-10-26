package zybook;

import java.util.Scanner;
/*This program computes the time required to double an investment
with an annual contribution.
*/
public class DoubleInvestment
{
public static void main(String[] args)
{
   final double RATE = 5;
   final double INITIAL_BALANCE = 10000;
   final double TARGET = 2 * INITIAL_BALANCE;

   Scanner in = new Scanner(System.in);
   System.out.print("Annual contribution: ");
   double contribution = in.nextDouble();

   double balance = INITIAL_BALANCE;
   int year = 0;

   // TODO: Add annual contribution, but not in year 0

   /* Your code goes here */
   while(balance < TARGET){
	   if (year == 0) {
		   double interest = balance * (RATE/100);
		   balance = balance + interest;
	   } else {
		   double interest = (balance + contribution) * (RATE/100);
		   balance = balance + contribution + interest;
	   }
	   year++;
   }

   System.out.println("Year: " + year);
   System.out.printf("Balance: %.2f%n", balance);
}
}
