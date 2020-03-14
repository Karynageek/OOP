package gmail.com;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File file1 = new File("C:\\Users\\Новая папка\\1.txt");
		File file2 = new File("C:\\Users\\Новая папка\\2.txt");
		File file3 = new File("C:\\Users\\Новая папка\\fileResult.txt");
		FileResult flr = new FileResult(file1, file2, file3);

	}

}
