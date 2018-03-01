

import java.io.IOException;

/**
 * KWICdriver: Main driver program to parse the file, process, sort and show the
 * output
 *
 */
public class KWICdriver {

	/**
	 * Main program
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {

		// Initialize Input and load file
		Input input = new Input();
		LineStorage lineStorage = input.parse("test.txt");

		// Initialize Circular Shift based on the line storage and process shift
		CircularShift circularShift = new CircularShift(lineStorage);
		circularShift.setup();

		// Initialize Alphabetizer based on the Circular Shift and sort
		Alphabetizer alphabetizer = new Alphabetizer(circularShift);
		alphabetizer.alpha();

		// Initialize Output based on the Alphabetizer and print output
		Output output = new Output(alphabetizer);
		output.print();
	}

}
