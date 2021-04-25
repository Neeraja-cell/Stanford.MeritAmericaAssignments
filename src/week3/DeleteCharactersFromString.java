package week3;

import acm.program.ConsoleProgram;

public class DeleteCharactersFromString extends ConsoleProgram {
	
	public void run() {
		String str = "How are you doing today?";
		System.out.println(removeAllOccurrences(str,  't' ));
	}
	public String removeAllOccurrences(String str, char ch) {
		char y[] = str.toCharArray();
		int size = str.length();
		
		int i = 0;
		String res = "";
		
		while(i !=size)
			if(y[i] != ch) {
				
				res=res +y[i];
				i++;
			}
			else {
				i++;
			}
			return res;
		
		//return str.substring(0, ch) + str.substring(ch + 1);
		
	}
	
	
}
