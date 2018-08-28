package com.soft.slk.training.files;

import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		File f = null;
		String[] strs = {"test1.txt", "test2.txt"};
		try {
			// for each string in string array 
			for(String s:strs ) {

				//pass the filename or directory name to File object
				f = new File(s);

				//apply File class methods on File object
				System.out.println("File name :"+f.getName());
				System.out.println("Path: "+f.getPath());
				System.out.println("Absolute path:" +f.getAbsolutePath());
				System.out.println("Parent:"+f.getParent());
				System.out.println("Exists :"+f.exists());
				if(f.exists())
				{
					System.out.println("Is writeable:"+f.canWrite());
					System.out.println("Is readable"+f.canRead());
					System.out.println("Is a directory:"+f.isDirectory());
					System.out.println("File Size in bytes "+f.length());
					System.out.println(" is executable: "+ f.canExecute());
				}

			} 
		} catch (Exception e) {
			// if any I/O error occurs
			e.printStackTrace();
		}
	}
}
