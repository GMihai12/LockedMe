package com;

import java.util.Scanner;

public class UserInput {
	public static void InterfaceUserInput() {
		String AppStatus="Running";
		Scanner sc = new Scanner(System.in);
		
		while(AppStatus == "Running") {
			
			int input = sc.nextInt();
			
			switch(input) {
			case 1:
				FileOptions.ReturnAllFiles();
				WelcomeScreen.InterfaceMenu();
				break;
			case 2:
				FileOptions.FileMenuOperations();
				break;
			case 3:
				AppStatus="Not Running";
				System.out.println("Application exited");
				sc.close();
				break;
			default:
				System.out.println("Please select a valid option.");
				WelcomeScreen.InterfaceMenu();
			}
		}
	}
	
	public static void FileMenuOperations() {
		System.out.println("Test");
	}
}
