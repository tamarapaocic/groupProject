package wordsInFile;

import java.util.ArrayList;

public class HowManyWordsInFile {

	public HowManyWordsInFile(ArrayList<String> fileContent){
	int count = 0;

	for (int i = 0; i < fileContent.size(); i++) {
		String[] words = fileContent.get(i).split("\\W");

		for (String word : words) {
			if (word.matches("\\w+")) {
				count++;
			}
		}
	}
	System.out.println("\n- Words in file: " + count);
}
}
