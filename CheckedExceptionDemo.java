import java.io.FileReader;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Program starts...");
		FileReader file = new FileReader("C:\\Users\\AZAM ROG\\git\\repository\\cjrb6\\test.txt");
		System.out.println("File is being read");
		System.out.println("Program end...");
	}
}