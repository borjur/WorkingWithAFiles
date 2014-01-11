import java.io.File;

public class DeleteAFile {
	
	public static void main(String[] args) {
		
		File f = new File("helloworld.txt");
		if (f.exists()) {
			if (!f.delete()) {
				System.out.println("the file cannot be deleted.");
			}
		} else {
			System.out.println("the file does not exist.");
		}
	}
}
