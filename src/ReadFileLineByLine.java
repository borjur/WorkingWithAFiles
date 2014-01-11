
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {

  public static void main(String[] args)
      throws IOException {
    BufferedReader reader = new BufferedReader(
        new FileReader("helloworld.txt"));
    String str = null;
    while ((str = reader.readLine()) != null) {
      System.out.println(str);
    }
    reader.close();
  }
}