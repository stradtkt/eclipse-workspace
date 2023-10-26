package com.tornados;

import java.util.Scanner;

public class Tornados {

	public static void main(String[] args) {
		/*
		 * 
		 * F-0 40-72 mph, Light damage, chimney damage, tree branches broken
		 * F-1 73-112 mph, Moderate damage, mobile homes pushed off foundation or flipped over
		 * F-2 113-157 mph, Considerable damage, mobile homes demolished, trees uprooted
		 * F-3 158-205 mph, Severe damage, roofs and walls torn down, trains overturned, cars thrown around
		 * F-4 207-260 mph, Devastating damage, well-constructed walls leveled
		 * F-5 261-318 mph, Violent damage, homes lifted off foundation and carried considerable distances, autos thrown as far as 100 meters.
		 * */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a wind speed:  ");
		int windSpeed = input.nextInt();
		if(windSpeed >= 40 && windSpeed <= 72) {
			System.out.println("F-0");
			System.out.println("Light damage, chimney damage, tree branches broken");
		} else if(windSpeed >= 73 && windSpeed <= 112) {
			System.out.println("F-1");
			System.out.println("Moderate damage, mobile homes pushed off foundation or flipped over");
		} else if(windSpeed >= 113 && windSpeed <= 157) {
			System.out.println("F-2");
			System.out.println("Considerable damage, mobile homes demolished, trees uprooted");
		} else if(windSpeed >= 158 && windSpeed <= 205) {
			System.out.println("F-3");
			System.out.println("Severe damage, roofs and walls torn down, trains overturned, cars thrown around");
		} else if(windSpeed >= 207 && windSpeed <= 260) {
			System.out.println("F-4");
			System.out.println("Devastating damage, well-constructed walls leveled");
		} else if(windSpeed >= 261 && windSpeed <= 318) {
			System.out.println("F-5");
			System.out.println("Violent damage, homes lifted off foundation and carried considerable distances, autos thrown as far as 100 meters.");
		} else {
			System.out.println("Not a tornado");
		}
	}

}
