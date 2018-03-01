
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Input: Reads the file and parses the input to the Line Storage
 */
public class Input {

	/**
	 * Stores lines to the Line Storage object
	 */
	LineStorage lineStorage;

	/**
	 * Construct Input
	 */
	public Input() {
		lineStorage = new LineStorage();
	}

	/**
	 * Reads the file and parses every line
	 * 
	 * @param file
	 * 
	 * @return Line Storage object
	 * 
	 * @throws IOException
	 */
	public LineStorage parse(String file) throws IOException {
		// Reads the file
		BufferedReader reader = new BufferedReader(new FileReader(file));

		// Count line
		int lineCounter = 0;

		// Line
		String line;

		// Read one line at a time
		while ((line = reader.readLine()) != null) {
			// Skip empty lines
			if (!"".equals(line)) {
				// Increase line counter
				lineCounter++;

				// Add line to the Line Storage
				lineStorage.addLine(lineCounter, line);

			}

		}

		// Close the file
		reader.close();

		// Return line storage
		return lineStorage;
	}
}
