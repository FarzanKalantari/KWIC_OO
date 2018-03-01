
import java.util.Arrays;
import java.util.List;

/**
 * Output: Shows the output based on the requirements
 *
 */
public class Output {

	/**
	 * Noise word list
	 */
	List<String> noiseWordList;

	/**
	 * Alphabetizer object
	 */
	Alphabetizer alphabetizer;

	/**
	 * Construct Output based on Alphabetizer
	 * 
	 * @param alphabetizer
	 */
	public Output(Alphabetizer alphabetizer) {
		this.alphabetizer = alphabetizer;

		// Declare noise words
		noiseWordList = Arrays.asList(new String[] { "a", "an", "the", "and", "or", "of", "to", "be", "is", "in", "out",
				"by", "as", "at", "off" });
	}

	/**
	 * Print the output
	 */
	public void print() {
		// Loop through the line list to examine every sorted line
		for (String line : alphabetizer.getLine()) {
			// Get the first word in lower case format
			String firstWord = line.split(" ")[0].toLowerCase();

			// If first word is not a noise word
			if (!noiseWordList.contains(firstWord)) {
				// Print the word in console
				System.out.println(line);
			}
		}
	}
}
