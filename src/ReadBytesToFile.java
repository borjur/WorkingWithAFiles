import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadBytesToFile {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("helloworld.txt");
		
		byte[] bs = new byte[1024];
		int len = -1;
		while ((len = in.read(bs)) != -1) {
			System.out.println(new String(bs, 0, len));
		}
		in.close();
	}
}