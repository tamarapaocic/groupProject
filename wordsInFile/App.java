package wordsInFile;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		runApp();
	}
	
	public static void runApp() throws Exception {

		System.out.println("Enter the name of the file: ");

		String fileName = input.nextLine();

		LoadFromFile load = new LoadFromFile(fileName);

		getData(load.getFileContent());
	}

	public static void getData(ArrayList<String> fileContent) {

		System.out.println("\nFile's data: ");
		HowManyWordsInFile wordsInFile = new HowManyWordsInFile(fileContent);
		HowManyUniqueWordsInFile uniqueWords = new HowManyUniqueWordsInFile(fileContent);
		HowManySentencesInFile sentencesInFile = new HowManySentencesInFile(fileContent);
		HowManyLettersInFile lettersInFile = new HowManyLettersInFile(fileContent);
		HowManyCharactersInFile charactersInFile = new HowManyCharactersInFile(fileContent);
		OccurrenceOfLettersInFile occurrenceOfLetters = new OccurrenceOfLettersInFile(fileContent);

	}

}
