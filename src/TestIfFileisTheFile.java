
import java.io.File;
public class TestIfFileisTheFile {
	
  public static void main(String[] args) {
	  
    File f = new File("helloworld.txt");
    if (f.isFile()) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    
    
    
    File ff = new File(".");
    listFiles(ff);
  }

  private static void listFiles(File ff) {
    if (ff.isFile()) {
      System.out.println(ff.getName());
      return;
    }
    for (File subFile : ff.listFiles()) {
      listFiles(subFile);
    }
    
    
  }
}