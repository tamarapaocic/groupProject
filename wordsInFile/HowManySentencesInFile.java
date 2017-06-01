package wordsInFile;

import java.util.ArrayList;

public class HowManySentencesInFile {

	public HowManySentencesInFile(ArrayList<String> fileContent){
		
		int count = 0;

		for (int i = 0; i < fileContent.size(); i++) {
			String[] sentences = fileContent.get(i).split("\\.|\\?|!");

			for (String sentence : sentences) {
					count++;
			}
		}
		System.out.println("- Sentences in file: " + count);
	}
	
}
