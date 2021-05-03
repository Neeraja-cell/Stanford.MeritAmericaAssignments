package week4;
import java.util.*;
import acm.program.*;

import acm.program.ConsoleProgram;

public class UniqueNames extends ConsoleProgram {
	private ArrayList <String> names = new ArrayList <String>();
	public void run() {
		askForNames();
		writeUniqueNames();

	}

	private void askForNames() {
		while(true) {
			String name = readLine("Enter name:");
			if(name.equals(""))break;
			if(names.contains(name) == false) {
				names. add(name);
			}
		}
		
	}

	private void writeUniqueNames() {
		// TODO Auto-generated method stub
		println("Unique name list contains:");
		for(int i = 0; i <names.size(); i++) {
			println(names.get(i));
		}
	}
	
}
