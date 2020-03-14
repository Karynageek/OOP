package gmail.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FileResult {
	private File fileResult;

	public FileResult(File file1, File file2, File fileResult) {
		super();
		this.fileResult = fileResult;
		createFile(file1, file2);
	}

	public FileResult(File fileResult) {
		super();

	}

	public void createFile(File file1, File file2) {
		try {
			if (!file1.exists() || !file2.exists()) {
				System.out.println("Not find!");
			} else {
				StringBuilder sb = new StringBuilder();
				int count = 0;
				for (int i = 0; i < getText(file2).length; i++) {
					for (int j = 0; j < getText(file1).length; j++) {
						if (getText(file1)[j].equalsIgnoreCase(getText(file2)[i])) {
							sb.append(getText(file1)[j]);
							sb.append(" ");
							count++;
							System.out.println("Number of coincidences: " + count);
						}
					}
				}

				try (PrintWriter pw = new PrintWriter(fileResult)) {
					fileResult.createNewFile();
					pw.write(sb.toString());

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String[] getText(File file) {
		String[] array = null;
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			array = br.readLine().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return array;
	}
}
