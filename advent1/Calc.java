package advent1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 
import java.util.ArrayList;
import java.util.Collections; 
public class Calc {
	public static ArrayList<Integer> listOne = new ArrayList<Integer>();
	public static ArrayList<Integer> listTwo = new ArrayList<Integer>(); 
	
	public static void main(String[] args) {
		readfile(); 
		
		//sort the lists 
		Collections.sort(listOne);
		Collections.sort(listTwo);
		int sum = 0; 
		for (int i = 0; i < listOne.size(); i++) {
			sum += Math.abs(listOne.get(i) - listTwo.get(i)); 
			System.out.println("first vlaue is: " + listOne.get(i) + " second value is: " + listTwo.get(i)); 
			System.out.println("Sum is: " + sum); 
		}

	}
	
	private static void readfile() {
		try {
			//read in the file
			File data = new File("C:\\Users\\juffu\\Downloads\\advent1.txt"); 
			Scanner scan = new Scanner(data); 
			
			//as long as it has data, print out the next line.
			
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
