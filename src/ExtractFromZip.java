
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ExtractFromZip {

  public static void main(String[] args)
      throws IOException {
    ZipInputStream zipIn = new ZipInputStream(new FileInputStream(
        "helloworld.zip"));
    ZipEntry entry = null;
    byte bs[] = new byte[1024];
    while ((entry = zipIn.getNextEntry()) != null) {
      // get file name
      System.out.printf("file: %s content: ", entry.getName());
      int len = -1;
      // read current entry to the buffer
      while((len=zipIn.read(bs)) != -1) {
        System.out.print(new String(bs, 0, len));
      }
      System.out.println();
    }
    zipIn.close();
  }
}