package com;

public class WelcomeScreen {

	public static void AppDetails() {
		String appName = "LockedMe.com";
		String developerDetails = "Mihai Grigoras";
		
		System.out.println("Application Name:"+appName);
		System.out.println("Developer:"+developerDetails+"\n");
		
	}
	
	public static void InterfaceDetails() {
		System.out.println("This interface will allow you to perform one of the following operations:");
		System.out.println(" - Return all the files from root directory");
		System.out.println(" - Add/Delete/Search a specified file\n");
	}
	
	public static void InterfaceMenu() {
		System.out.println("#######################################");
		System.out.println("Please select one of the below options#");
		System.out.println("#######################################");
		System.out.println("1.Return the current files in root directory");
		System.out.println("2.Display user interface options");
		System.out.println("3.Exit\n");
	}
	
	public static void InterfaceMenuOptions() {
		System.out.println("#######################################");
		System.out.println("Please select one of the below options#");
		System.out.println("#######################################");
		System.out.println("1.Add file");
		System.out.println("2.Delete a file");
		System.out.println("3.Search a file");
		System.out.println("4.Return to previous menu");
		System.out.println("5.Exit\n");
	}
}
