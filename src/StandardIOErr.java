
public class StandardIOErr {
  public static void main(String[] args) {
	  
	  
    System.out.println("hello world!");
    System.setOut(System.err);
    System.out.println("hello world!");
  }
}