
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileOperationTest {

  public static void main(String[] args)
      throws IOException {
    RandomAccessFile file = new RandomAccessFile(
        "helloworld.txt", "rw");
    file.writeBytes("hello world!");
    file.writeChar('A');
    file.writeInt(1);
    file.writeBoolean(true);
    file.writeFloat(1.0f);
    file.writeDouble(1.0);
    file.close();
  }
}