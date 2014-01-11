
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class WriteFormattedStringToFile {

  public static void main(String[] args)
      throws IOException {
    PrintStream print = new PrintStream(
        new FileOutputStream("helloworld.txt"));
    print.printf("%s %s!", "hello", "world");
    print.close();
  }
}