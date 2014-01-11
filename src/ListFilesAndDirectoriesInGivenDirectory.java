
import java.io.File;
public class ListFilesAndDirectoriesInGivenDirectory {
	
  public static void main(String[] args) {
	  
    File f = new File(".");
    
    for (String str : f.list()) {
      System.out.println(str);
      
      
    }
    
    
    //------------------------
    File ff = new File(".");
    for (File subFile : ff.listFiles()) {
      System.out.println(subFile.getName());
    }
    
    
  }
}
