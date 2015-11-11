package aplicationTwo;

import java.io.File;
import java.util.Scanner;

public class WordGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String table;
		String path;
		int wordsCounter = 0;

		System.out.println("Please enter the path file:");
		path = sc.next();
		File file = new File(path);

		try {
			Scanner fileReader = new Scanner(file);

			while (fileReader.hasNext()) {
				table = fileReader.next();
				if (table.contains("i") && !table.contains("v")
						&& !table.contains("a") && !table.contains("n")) {
					wordsCounter++;
				}

			}
			System.out.println("The word has been found:" + wordsCounter);
			fileReader.close();
		}

		catch (Exception e) {
			e.printStackTrace();

		}

	}

}
