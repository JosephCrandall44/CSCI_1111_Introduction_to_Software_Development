import java.io.*;
import java.util.Arrays;

public class Exercise6 {

	private static String path;
	
	public static void ReadFile (String file_path) {
		path = file_path;
		
		
	}
	

	public static int readLines() throws IOException {
		
		FileReader lines = new FileReader(path);
		BufferedReader bf = new BufferedReader(lines);
		
		String aLine;
		int numberOfLines = 0;
		
		while((aLine = bf.readLine()) != null) {
			numberOfLines++;
		}
		
		bf.close();
		return numberOfLines;
		
	}
	
	public static String[] OpenFile() throws IOException {
		FileReader myReader = new FileReader(path);
		BufferedReader lineRead = new BufferedReader(myReader);
		
		int numberOfLines = readLines();
		String[] textData = new String[numberOfLines];
		
		for(int i=0; i<numberOfLines; i++) {
			textData[i] = lineRead.readLine();
		}
		lineRead.close();
		return textData;
	}
	
	public static void main(String[] args) throws IOException {
		
		String fileName = "C:/Users/josephcrandall/Documents/GW/Spring_2014/Java/JavaCode/Hw1/bin/MajicNumber.txt";
				
			ReadFile(fileName);
			
			String[] arrayLines = OpenFile();
			
			System.out.println(Arrays.toString(arrayLines));
		}
		
	}


