package week4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import acm.program.ConsoleProgram;
import acm.util.ErrorException;



public class Histograms extends ConsoleProgram {
	
	public void run() {
		printHistogram();
		initHistogram();
		readScoresIntoHistogram();
	}
	/* Initializes the histogram array */
	private void initHistogram() {
	histogramArray = new int[11];
	for (int i = 0; i < histogramArray.length; i++) {
	histogramArray[i] = 0;
	}
	}
	/* Reads the exam scores, updating the histogram */
	private void readScoresIntoHistogram() {
	try {
	Scanner fileScanner =
	 new Scanner(new File(DATA_FILE));
	while (fileScanner.hasNextLine()) {
	String line = fileScanner.nextLine();
	int score = Integer.parseInt(line);
	if (score < 0 || score > 100) {
	fileScanner.close();
	throw new ErrorException(
	 "That score is out of range");
	} else {
	int range = score / 10;
	histogramArray[range]++;
	}
	}
	fileScanner.close();
	} catch (IOException ex) {
	throw new ErrorException(ex);
	}
	}
	/* Displays the histogram */
	private void printHistogram() {
	for (int range = 0; range <= 10; range++) {
	String label;
	
	if (range == 0) {
	label = "00-09";
	
	} else if (range == 10) {
	label = " 100";
	} else {
	label = (10 * range) + "-" + (10 * range + 9);
	}
	String stars = createStars(histogramArray[range]);
	println(label + ": " + stars);
	}
	}
	/* Creates a string consisting of n stars */
	private String createStars(int n) {
	String stars = "";
	for (int i = 0; i < n; i++) {
	stars += "*";
	}
	return stars;
	}
	/* Private instance variables */
	private int[] histogramArray;
	/* Name of the data file */
	private static final String DATA_FILE = "MidtermScores.txt";
	
	
}
