import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String message = "abc def ghi\n";

		try {
		
			FileWriter fw = new FileWriter("hello.txt");
			
			fw.append(message);
			fw.append(message);
			fw.close();
			System.out.println("Writing to file hello.txt");
			
		} catch (IOException e) {
			System.out.println("OOPS");
			e.printStackTrace();
		}
		
		System.out.println("---------------");
		
		try {
			File inputFile = new File("hello.txt");
			Scanner fileIn = new Scanner(inputFile);
			
			String line1 = fileIn.nextLine();
			String[] words = line1.split(" ");
			System.out.println(Arrays.toString(words));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
