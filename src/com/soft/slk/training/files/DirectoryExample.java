package com.soft.slk.training.files;

import java.io.File;

public class DirectoryExample {

	   public static void main(String args[]) {
	      String dirname = "/tmp/user/java/bin";
	      File d = new File(dirname);
	      
	      // Create directory now.
	      d.mkdirs();
	      
//	      
	      String[] paths;
	      File file = null;
	      try {      
	          // create new file object
	          file = new File("/tmp");

	          // array of files and directory
	          paths = file.list();

	          // for each name in the path array
	          for(String path:paths) {
	             // prints filename and directory name
	             System.out.println(path);
	          }
	       } catch (Exception e) {
	          // if any error occurs
	          e.printStackTrace();
	       }

	   }
	}