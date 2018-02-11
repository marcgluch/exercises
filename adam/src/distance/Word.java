package distance;

import java.util.List;

public class Word {
	public int length;
	char[] letters = new char[length];
	
	public Word (String word) {
		length = word.length();
		for(int i = 0; i < length - 1; i++)
			letters[i] = word.charAt(i);
	}

	public boolean shorterThan(Word word2) {
		if(this.length < word2.length)
			return true;
		else
			return false;
	}
	

	
	public int getLength() {
		return length;
	}

	public char charAt(int i) {
		return letters[i];
	}
	
}
