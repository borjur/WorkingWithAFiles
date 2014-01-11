
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressToZipFile {

  public static void main(String[] args)
      throws IOException {
    ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(
        "helloworld.zip"));
    String str = "hello world!";
    for (int i = 0; i < 3; i++) { //gives us 3 files
      zipOut.putNextEntry(new ZipEntry("helloworld" + i + ".txt"));
      zipOut.write(str.getBytes());
      zipOut.closeEntry();
    }
    zipOut.close();
  }
}