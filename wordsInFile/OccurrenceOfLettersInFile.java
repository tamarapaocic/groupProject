package wordsInFile;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class OccurrenceOfLettersInFile {

	public OccurrenceOfLettersInFile(ArrayList<String> fileContent){
		
		Map<Character, Integer> treeMap = new TreeMap<Character, Integer>();
		for (char i = 'a'; i <= 'z'; i++) {
		    treeMap.put(i, 0);
		}

		char[] alphabet = fileContent.toString().toCharArray();

		for (int i = 0; i < alphabet.length; i++) {
		    char ch = Character.toLowerCase(alphabet[i]);
		    if (treeMap.containsKey(ch)) {
		        treeMap.put(ch, treeMap.get(ch) + 1);
		    }
		}
        System.out.println("- Occurrence of letters: ");
		for (char key : treeMap.keySet()) {
		    int count = treeMap.get(key);
		    if (count > 0) {
		        System.out.println("  " + key + ":" + treeMap.get(key));
		    }
		}
	}
}