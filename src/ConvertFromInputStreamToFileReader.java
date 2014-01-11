
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ConvertFromInputStreamToFileReader {

  public static void main(String[] args)throws IOException {
	  
    Reader in = new InputStreamReader(new FileInputStream("helloworld.txt"));
    char cs[] = new char[1024];
    int len = -1;
    while ((len = in.read(cs)) != -1) {
      System.out.println(new String(cs, 0, len));
    }
    in.close();
  }
}