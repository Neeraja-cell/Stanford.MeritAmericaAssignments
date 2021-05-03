package week4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.FileReader;
import java.io.InputStreamReader;

import acm.program.ConsoleProgram;
import acmx.export.java.io.FileInputStream;
import acmx.export.java.io.FileReader;

public class WordCount extends ConsoleProgram {
	
	public void run() {
       
		 File file = new File("C:\\Users\\neera\\lear.txt.docx");
	        FileInputStream fileStream = null;
			try {
				fileStream = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        InputStreamReader input = new InputStreamReader(fileStream);
	        BufferedReader reader = new BufferedReader(input);
	          
	        String line;
	          
	        // Initializing counters
	        int countWord = 0;
	        int sentenceCount = 0;
	        int characterCount = 0;
	        int paragraphCount = 1;
	        //int whitespaceCount = 0;
	          
	        // Reading line by line from the 
	        // file until a null is returned
	        try {
				while((line = reader.readLine()) != null)
				{
				    if(line.equals(""))
				    {
				        paragraphCount++;
				    } else {
				        characterCount += line.length();
				          
				        // \\s+ is the space delimiter in java
				        String[] wordList = line.split("\\s+");
				          
				        countWord += wordList.length;
				      //  whitespaceCount += countWord -1;
				          
				        // [!?.:]+ is the sentence delimiter in java
				        String[] sentenceList = line.split("[!?.:]+");
				          
				        sentenceCount += sentenceList.length;
				    }
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	          
	        System.out.println("words = " + countWord);
	        System.out.println(" sentences = " + sentenceCount);
	        System.out.println(" characters = " + characterCount);
	        System.out.println("paragraphs = " + paragraphCount);
	       // System.out.println("Total number of whitespaces = " + whitespaceCount);
	    }
		
		
		// {
//			BufferedReader rd;
//			try {
//				rd = new BufferedReader(new FileReader("lear.txt"));
//				while(true) {
//					String line = rd.readLine();
//					if(line == null)break;
//					println(line);
//				}
//				
//			} catch (FileNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			
		
		
//		
//		
//	
//	
	}


