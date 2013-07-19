import java.io.FileNotFoundException;


public class TestaException {
	public static void main(String[] args) {
		try {
			new java.io.FileReader("arquivo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
