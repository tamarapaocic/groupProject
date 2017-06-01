package wordsInFile;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LoadFromFile {
	
	private ArrayList<String> fileContent = new ArrayList<>();

	 public LoadFromFile(String fileName) throws NoSuchFileException, Exception {


		try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
			String line;
			while ((line = reader.readLine()) != null) {
				fileContent.add(line);
			}
			
		} catch (NoSuchFileException e) {
			System.out.println("File doesn't exist! ");
			App.runApp();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			App.runApp();
		}
	 }

	public ArrayList<String> getFileContent() {
		return fileContent;
	}
}
