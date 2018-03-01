
import java.util.ArrayList;
import java.util.List;

/**
 * CircularShift: Performs circular word shift to the right
 *
 */
public class CircularShift {

	/**
	 * Line Storage object
	 */
	LineStorage lineStorage;

	/**
	 * Stores circular line list
	 */
	List<String> circularLineList;

	/**
	 * Construct the Circular Shift object based on Line Storage object
	 * 
	 * @param lineStorage
	 */
	public CircularShift(LineStorage lineStorage) {
		this.lineStorage = lineStorage;
		circularLineList = new ArrayList<String>();
	}

	/**
	 * Performs the circular shifts and adds them to the circular line list
	 */
	public void setup() {
		String line = null;

		// Loop through all lines in the line storage until there is no more
		// lines available
		for (int lineNumber = 1; (line = lineStorage.getLine(lineNumber)) != null; lineNumber++) {
			// System.out.println("Line number " + lineNumber + ": " + line);

			// Add the original line to the list
			circularLineList.add(line);
			// System.out.println(line);

			// Perform the circular shift based on the list of words in that
			// line retrieved from line storage
			String array[] = lineStorage.getWord(lineNumber);
			int shift = array.length - 1;
			for (int i = 0; i < shift; i++) {
				addCircleShiftRight(array, shift);
			}
			// System.out.println();
		}

		/*
		 * for (String l: circularLineList) { System.out.println(l); }
		 */
	}

	/**
	 * Perform circular shift of the array based on the shift value (or, number
	 * of shifts)
	 * 
	 * @param array
	 * @param shift
	 */
	private void addCircleShiftRight(String[] array, int shift) {
		// Copy the array from the original array based on the shift
		String[] array2 = new String[shift];
		for (int i = 0; i < shift; i++) {
			array2[i] = array[i];
		}

		// Move the last array elements to the front
		System.arraycopy(array, shift, array, 0, array.length - shift);

		// Initialize the lines first word
		String line = array[0];

		// Fill up the rest of array based on the shift
		for (int i = array.length - shift; i < array.length; i++) {
			array[i] = array2[shift + i - array.length];

			// Update the line with current word
			line += " " + array[i];
		}

		// Add this shifted line to the list
		// System.out.println(line);
		circularLineList.add(line);
	}

	/**
	 * @return Get the circular line list
	 */
	public List<String> getLine() {
		return circularLineList;
	}

}
