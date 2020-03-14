package gmail.com;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOService {
	private IOService() {

	}

	public static void streamCopy(InputStream is, OutputStream os) throws IOException {
		byte[] buffer = new byte[10_000_000];
		int readByte = 0;

		for (; (readByte = is.read(buffer)) > 0;) {
			os.write(buffer, 0, readByte);
		}

	}
}
