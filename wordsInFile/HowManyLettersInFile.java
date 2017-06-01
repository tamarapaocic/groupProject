package wordsInFile;

import java.util.ArrayList;

public class HowManyLettersInFile {

	public HowManyLettersInFile(ArrayList<String> fileContent){
	int count = 0;

	for (int i = 0; i < fileContent.size(); i++) {
		for(int j = 0; j < fileContent.get(i).length(); j++)
    if (Character.isLetter(fileContent.get(i).charAt(j))){
    	count++;
    }
	}
	System.out.println("- Letters in file: " + count);
}
}