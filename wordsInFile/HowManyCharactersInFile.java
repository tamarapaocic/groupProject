package wordsInFile;

import java.util.ArrayList;

public class HowManyCharactersInFile {

		public HowManyCharactersInFile(ArrayList<String> fileContent){
			int count = 0;

			for (int i = 0; i < fileContent.size(); i++) {
				for(int j = 0; j < fileContent.get(i).length(); j++)
				    if (fileContent.get(i).charAt(j) != ' ' || Character.isWhitespace(fileContent.get(i).charAt(j) ) ){
				    	count++;
				    }
					}
			
			System.out.println("- Characters in file: " + count);
		}

}