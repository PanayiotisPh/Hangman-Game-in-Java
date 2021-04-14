package epl133_team20.hw5;

public class Rules {
	private int wordSize;
	private int tries;
	private Dictionary Dict;
	public Rules(int wordSize, int tries, Dictionary Dict){
		this.wordSize=wordSize;
		this.tries=tries;
		this.Dict=Dict;
	}
	/**
	 * @return the wordSize
	 */
	public int getWordSize() {
		return wordSize;
	}
	
	
	/**
	 * @return the tries
	 */
	public int getTries() {
		return tries;
	}

	/**
	 * @return the dict
	 */
	public Dictionary getDict() {
		return Dict;
	}
	
	//test

	
	
	

}
