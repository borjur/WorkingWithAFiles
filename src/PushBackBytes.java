
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushBackBytes {

  public static void main(String[] args)
      throws IOException {
    PushbackInputStream push = new PushbackInputStream(
        new ByteArrayInputStream("hello, world!".getBytes()));
    int temp = 0;
    while ((temp = push.read()) != -1) {
      if (temp == ',') {     // , and . in between
        push.unread('.');
      }
      System.out.print((char) temp);
    }
  }
}