package week4;

import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class NameCounts extends ConsoleProgram {
	private Map <String, Integer> names = new HashMap <String, Integer>();
	public void run() {
		AskUserForName();
		returnAnswer();

	}
	private void AskUserForName() {
		// TODO Auto-generated method stub
		while(true) {
			String name = readLine("Enter name:");
			if(name.equals("")) break;
			if(names.containsKey(name)== false) {
				names.put(name, 1);
				
			
			}else {
				int addOne =names.get(name) + 1;
				names.put(name,  addOne);
			}
		}
	}
	private void returnAnswer() {
		// TODO Auto-generated method stub
		for(String name: names.keySet()) {
			println("Entry[" + name+ "] has count " + names.get(name));
		}
		
	}
	
}
