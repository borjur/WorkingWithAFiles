
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class ConvertFromOutputStreamToFileWriter {

  public static void main(String[] args) throws IOException {
    Writer out = new OutputStreamWriter(new FileOutputStream("helloworld.txt"));
    out.write("hello world!");
    out.close();
  }
}