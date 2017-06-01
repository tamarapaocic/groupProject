package wordsInFile;

import java.util.ArrayList;

public class HowManyUniqueWordsInFile {

	public HowManyUniqueWordsInFile(ArrayList<String> fileContent){
		
		ArrayList<String> uniqueWords = new ArrayList<>();
	
		for(int i = 0; i < fileContent.size(); i++){
			String[] words = fileContent.get(i).split("\\W");
			
			for(String word: words){
				if(word.matches("\\w+") & !uniqueWords.contains(word)){
					uniqueWords.add(word.toLowerCase());
				}
			}
		}
		
		System.out.println("- Number of unique words: " + uniqueWords.size());
	}
}
