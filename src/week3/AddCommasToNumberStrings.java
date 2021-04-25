package week3;

import java.text.DecimalFormat;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	public void run() {
		while (true) {
			 String digits = readLine("Enter a numeric string: ");
			 if (digits.length() == 0) break;
			 println(addCommasToNumericString(digits));
			 }


	}

	private String addCommasToNumericString(String digits) {
		// TODO Auto-generated method stub
		int len = digits.length();
		String results = "";
		int num = 0;
		for (int i = len -1; i >=0; i--)//1000
		{
			results = digits.charAt(i) + results;
			num++;
			// this  will add comma after every 3 digits
			if((num % 3 == 0) && (i>0)) {
				results = "," + results;
			}
			
		}
		return results;
	}
	
}
