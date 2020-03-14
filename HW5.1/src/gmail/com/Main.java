package gmail.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Filter flt = new Filter("docx");
		File folder1 = new File("MyFolder1");
		File folder2 = new File("MyFolder2");
		try {
			File[] files = folder1.listFiles();
			for (File file : files) {
				if (flt.accept(file)) {
					FileInputStream in = new FileInputStream(file);
					FileOutputStream out = new FileOutputStream(folder2 + "/" + file.getName());
					IOService.streamCopy(in, out);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}