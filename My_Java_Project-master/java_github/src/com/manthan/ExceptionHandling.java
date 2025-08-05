package com.manthan;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {
			int x = 2/0; 
		} catch (Exception e) {
			System.out.println("You cannot / by zero"); 
		}
	}
}
