
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteCharsToFile {

  public static void main(String[] args)
      throws IOException {
    Writer out = new FileWriter("helloworld.txt");
    String str = "hello world!";
    out.write(str);
    out.close();
  }
}