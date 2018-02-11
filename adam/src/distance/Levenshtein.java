package distance;
import java.lang.Math;

public class Levenshtein {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//Not done with this method yet, I need to figure out how to make it work for situations like:
	// top, stop    top, tops     the first example has the same characters but shifted right one, so my loop
	// 																						doesn't work
	public boolean isNeighbor(Word word1, Word word2) {
		int lengthDifference = lengthDifference(word1, word2);
		if(lengthDifference > 1)
			return false;
		
		int charDifferences = 0;
		Word shorterWord = shorterWord(word1, word2);
		Word longerWord = longerWord(word1, word2);
		
		for(int i = 0; i < shorterWord.length; i++) {
			if(word1.charAt(i) != word2.charAt(i))
				charDifferences++;
		}
		return true;
	}
	
	public int lengthDifference(Word word1, Word word2) {
		return Math.abs(word1.length - word2.length);
	}

	public Word shorterWord(Word word1, Word word2) {
		if(word1.length < word2.length)
			return word1;
		else
			return word2;
	}
	
	public Word longerWord(Word word1, Word word2) {
		if(word1.length >  word2.length)
			return word1;
		else
			return word2;
	}
	
}
