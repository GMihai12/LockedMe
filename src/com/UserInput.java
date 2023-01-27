package com;

import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

public class UserInput {
	public static void InterfaceUserInput() throws IOException {
		String AppStatus="Running";
		Scanner sc = new Scanner(System.in);
		
		while(AppStatus == "Running") {
			
			try {
				WelcomeScreen.InterfaceMenu();	
				int input = sc.nextInt();
			
				switch(input) {
				case 1:
					FileOptions.ReturnAllFiles();
				
					break;
				case 2:
					FileOptions.FileMenuOperations();
					break;
				case 3:
					AppStatus="Not Running";
					System.out.println("Application exited");
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please make sure to select a valid option.\n");
				}
				} catch (InputMismatchException e) {
					System.out.println(e.toString());
					System.out.println("Please make sure to select a valid option.\n\n");
					sc.next();
			}
		}
	}
}
	

