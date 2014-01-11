
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteBytesToTheFile {

  public static void main(String[] args)
      throws IOException {
    OutputStream out = new FileOutputStream(
        "helloworld.txt");
    String str = "hello world!";
    out.write(str.getBytes());
    out.close();
    
    
    OutputStream outt = new FileOutputStream(
            "helloworld.txt");
    
        String strr = "hello world!";
        
        for (byte b : strr.getBytes()) {
          outt.write(b);
        }
        outt.close();
  }
}