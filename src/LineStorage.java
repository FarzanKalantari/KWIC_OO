

import java.util.HashMap;

/**
 * LineStorage: Stores the line and words
 */
public class LineStorage {

	/**
	 * Map that stores line number and corresponding sentence/line
	 */
	private HashMap<Integer, String> lineMap;

	/**
	 * Map that stores line number and corresponding word array
	 */
	private HashMap<Integer, String[]> wordMap;

	/**
	 * Construct the object
	 */
	public LineStorage() {
		lineMap = new HashMap<>();
		wordMap = new HashMap<>();
	}

	/**
	 * Get line based on the line number
	 */
	public String getLine(Integer lineNumber) {
		return lineMap.get(lineNumber);
	}

	/**
	 * Get word array based on the line number
	 */
	public String[] getWord(Integer lineNumber) {
		return wordMap.get(lineNumber);
	}

	/**
	 * Add a line to the storage line map which atomatically calls the addWord
	 * to add the storage word array map
	 */
	public void addLine(Integer lineNumber, String line) {
		lineMap.put(lineNumber, line);

		addWord(lineNumber, line);
	}

	/**
	 * Add storage word arry map
	 */
	public void addWord(Integer lineNumber, String line) {
		wordMap.put(lineNumber, line.split(" "));
	}
}
