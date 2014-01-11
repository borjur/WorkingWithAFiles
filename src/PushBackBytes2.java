
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushBackBytes2 {

  public static void main(String[] args)
      throws IOException {
    PushbackInputStream push = new PushbackInputStream(
        new ByteArrayInputStream("hello, world!".getBytes()), 10);
    int temp = 0;
    while ((temp = push.read()) != -1) {
      if (temp == ',') {
        push.unread("(...)".getBytes());
      }
      System.out.print((char) temp);
    }
  }
}
