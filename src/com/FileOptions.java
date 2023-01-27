package com;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FileOptions {

	
	
	public static void ReturnAllFiles() {
		File rootfolder = new File("root");
		
		if(!rootfolder.exists()) {
			rootfolder.mkdirs();
		}

		File[] files = rootfolder.listFiles();
		
		List<File> fileList = Arrays.asList(files);
		
		System.out.println("Returning the files from root directory in ascending order:");
		Collections.sort(fileList);
		for (File file:fileList) {
			System.out.println(file);
		}
		System.out.println();
	}
	
	
	
	public static void FileMenuOperations() throws IOException {
		
		File rootfolder = new File("root");
		if(!rootfolder.exists()) {
			rootfolder.mkdirs();
		}
		
		String UserOptionsMenu="Running";
		Scanner sc = new Scanner(System.in);
		
		while(UserOptionsMenu == "Running") {
			
			try {
				WelcomeScreen.InterfaceMenuOptions();
				int input = sc.nextInt();
				switch(input) {
				case 1:
					System.out.println("Please provide the name of the file you wish to add");
					String fileName = sc.next();
					String filePath = "./root/"+fileName;
					File ff = new File(fileName);
					if(ff.exists()) {
						System.out.println("File already present");
					}else {
							//ff.createNewFile();
						FileWriter fw = new FileWriter(filePath);
						fw.write("Welcome user your create file with name as "+fileName);
						fw.flush();
						System.out.println("File created...");
					}
					break;
				case 2:
					System.out.println("Please provide the name of the file you wish to delete");
					String fileToDelete= sc.next();
					String fileToDeletePath = "./root/"+fileToDelete;
					File ftd = new File(fileToDeletePath);
					
					if(FileOptions.fileExistsCaseSensitive(fileToDeletePath)) {
						
						ftd.delete();
						System.out.println(ftd.getName()+" was successfully deleted");
					}
					else {
						System.out.println("Failed to delete "+ftd.getName());
						//FileOptions.findFile(ftd.getName());
					}
					
					break;
				case 3:
					System.out.println("Please provide the name of the file you wish to search for");
					String fileToSearch= sc.next();
					String fileToSearchPath = "./root/"+fileToSearch;
					if(FileOptions.fileExistsCaseSensitive(fileToSearchPath)) {
						
						System.out.println("The file was found\n");
					}
					else {
						System.out.println("The file was not found\n");
						//FileOptions.findFile(ftd.getName());
					}
					
					//FileOptions.findFile(fileToSearch);
					break;
				case 4:
					return;
				case 5:
					UserOptionsMenu="Not Running";
					System.out.println("Application exited");
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option.");
				}
				} catch (InputMismatchException e) {
					System.out.println(e.toString()+"\n\n");
					sc.next();
			}
		}
	}
	
	public static boolean fileExistsCaseSensitive(String path) {
	    try {
	        File file = new File(path);
	        return file.exists() && file.getCanonicalFile().getName().equals(file.getName());
	    } catch (IOException e) {
	        return false;
	    }
	}
}


