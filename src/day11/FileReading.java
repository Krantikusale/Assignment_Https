package day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) {
		File myfile = new File("./properties/Config.properties");
		/*
		 * System.out.println(myfile.canRead()); System.out.println(myfile.canWrite());
		 * System.out.println(myfile.canExecute());
		 * System.out.println(myfile.getName()); System.out.println(myfile.delete());
		 */

		try {
			FileInputStream fis = new FileInputStream(myfile);
			Properties pro = new Properties();
			pro.load(fis);
			System.out.println(pro.get("url"));
			System.out.println(pro.get("Student"));
			System.out.println(pro.get("java"));

		} catch (FileNotFoundException e) {
			System.out.println("file is missing" + e.getMessage());
			
		} 
		
		catch (IOException e) {
			System.out.println("file operation not supported" + e.getMessage());
		}

	}

}
