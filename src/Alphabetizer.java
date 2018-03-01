
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Alphabetizer: Sorts the list of output lines
 */
public class Alphabetizer {

	/**
	 * Circular Shift object
	 */
	CircularShift circularShift;

	/**
	 * Stores sorted list
	 */
	List<String> sortedLineList;

	/**
	 * Construct the Alphabetizer object based on Circular Shift object
	 * 
	 * @param circularShift
	 */
	public Alphabetizer(CircularShift circularShift) {
		this.circularShift = circularShift;
		sortedLineList = new ArrayList<String>();
	}

	/**
	 * Makes a copy of the original list from circularShift and sorts this new
	 * list so that source is unchanged
	 */
	public void alpha() {
		// Copy from the original list to a new list
		for (String line : circularShift.getLine()) {
			sortedLineList.add(line);
		}

		// Sort the new list
		Collections.sort(sortedLineList);
	}

	/**
	 * @return Sorted list
	 */
	public List<String> getLine() {
		return sortedLineList;
	}
}
