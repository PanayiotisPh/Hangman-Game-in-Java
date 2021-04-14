package team20.hw5;

import java.util.*;

public class Hangman {
	Set<Character> foundChars = new HashSet<>();
	Set<Character> attempted = new HashSet<>();
	Rules data;
	
	public Hangman(int wordSize, int tries, Dictionary Dict) {
		data = new Rules(wordSize, tries, Dict);
	}
	
	public void addFoundChars(char in) {
		foundChars.add(in);
		foundChars
			.stream()
			.sorted();
	}
	
	public void addAttemptrd(char in) {
		attempted.add(in);
	}
	
	public Set<Character> getAttempted() {
		return attempted;
	}
	
	public Set<Character> getFoundChars(){
		return foundChars;
	}
	
	public void checkInput(String in) {
		Scanner scan = new Scanner(System.in);
		String userIn;
		if(!(( in.charAt(0)>='A' && in.charAt(0)<='Z' ) || ( in.charAt(0)>='a' && in.charAt(0)<='z' ))) {
			System.out.println("Wrong Input. Try Again: ");
			//userIn.scanLine();
			
			
		
			
		}
		
	}

}
