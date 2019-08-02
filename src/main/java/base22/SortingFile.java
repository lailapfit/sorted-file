package base22;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class SortingFile {

	public static void main(String[] args) throws FileNotFoundException {
		File unsortedIncomingFile = new File("unsorted.txt");

		File sortedFile = new File("sorted.txt");

		@SuppressWarnings("resource")
		PrintWriter printWriter = new PrintWriter(sortedFile.getAbsoluteFile());

		@SuppressWarnings("resource")
		Scanner incoming = new Scanner(unsortedIncomingFile);

		String[] unsortedStrings = new String[25];

		while (incoming.hasNextLine()) {
			unsortedStrings = incoming.nextLine().split(" ");
		}

		Arrays.sort(unsortedStrings, (a, b) -> Integer.compare(a.length(), b.length()));

		for (int i = 0; i < unsortedStrings.length; i++) {
			printWriter.write(unsortedStrings[i] + "\n");
		}
		
		printWriter.flush();

	}

}
