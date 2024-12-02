package advent1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Similarity {
	public static ArrayList<Integer> listOne = new ArrayList<Integer>();
	public static ArrayList<Integer> listTwo = new ArrayList<Integer>(); 
	
	public static void main(String[] args) {
		readfile(); 
		
		//sort the lists 
		Collections.sort(listOne);
		Collections.sort(listTwo);
		int sum = 0; 
		for (int i = 0; i < listOne.size(); i++) {
			for (int j = 0; j < listTwo.size(); j++) {
				System.out.println("First List number is: " + listOne.get(i));
				System.out.println("Second List number is: " + listTwo.get(j));
				if (listOne.get(i).equals(listTwo.get(j))){
					sum += listOne.get(i); 
				}
				System.out.println("sum is: " + sum); 
			}
		}

	}
	
	private static void readfile() {
		try {
			//read in the file
			File data = new File("C:\\Users\\juffu\\Downloads\\advent1.txt"); 
			Scanner scan = new Scanner(data); 
				
			while (scan.hasNext()) {
				//read each line, split the line at the triple space, parse the values to ints
				String line = scan.nextLine();
				String[] splitLine = line.split("   "); 
				listOne.add(Integer.parseInt(splitLine[0])); 
				listTwo.add(Integer.parseInt(splitLine[1]));
				
			}
			scan.close(); 
		
		
		} catch (FileNotFoundException e) {
			System.out.println("Error reading in data");
			e.printStackTrace();
		}

	}
}