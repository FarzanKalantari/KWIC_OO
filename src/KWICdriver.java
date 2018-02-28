import java.io.IOException;

public class KWICdriver {

	public static void main(String args[]) throws IOException {

		Input input = new Input();
		LineStorage lineStorage = new LineStorage();
		CircularShift circularShift = new CircularShift();

		input.read("C:\\Users\\ac3_o\\Documents\\eclipse workspace\\KWIC_OO\\test.txt");
		input.store(lineStorage);
		circularShift.setup(lineStorage);
	}

}
