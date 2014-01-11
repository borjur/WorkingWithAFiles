
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class AppendBytesToFile {

  public static void main(String[] args)
      throws IOException {
    OutputStream out = new FileOutputStream(
        "helloworld.txt", true);
    String str = "hello world!";
    out.write(str.getBytes());
    out.close();
  }
}