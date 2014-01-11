
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadCharsFromFile {

  public static void main(String[] args)
      throws IOException {
    Reader in = new FileReader("helloworld.txt");
    char cs[] = new char[1024];
    int len = -1;
    while ((len = in.read(cs)) != -1) {
      System.out.println(new String(cs, 0, len));
    }
    in.close();
  }
}