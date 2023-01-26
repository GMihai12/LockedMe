package com;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileOptions {

	public static void ReturnAllFiles() {
		File folder = new File("root");
		
		if(!folder.exists()) {
			folder.mkdirs();
		}

		File[] files = folder.listFiles();
		
		List<File> fileList = Arrays.asList(files);
		
		System.out.println("Returning the files from root directory in ascending order:");
		Collections.sort(fileList);
		for (File file:fileList) {
			System.out.println(file);
		}
		System.out.println();
	}
	
	public static void FileMenuOperations() {
		System.out.println("These are the file menu options");
	}
}


