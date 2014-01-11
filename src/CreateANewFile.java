import java.io.File;

public class CreateANewFile {
	public static void main(String[] args) {
		File f = new File("helloworld.txt");
		try {
			f.createNewFile();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}