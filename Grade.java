package assignment01;

/**
 * The "Grade" enumeration contains all the final static (immutable) constants
 * for the grades. It shows the range of the grade (the upper and lower bounds)
 * as well as whether the grade is a pass. It contains the usual constructor,
 * get methods and toString method.
 * 
 * @author Charlie Cho 18010426
 *
 */
public enum Grade {
	APLUS(100, 90, true), A(89, 85, true), AMINUS(84, 80, true), BPLUS(79, 75, true), B(74, 70, true),
	BMINUS(69, 65, true), CPLUS(64, 60, true), C(59, 55, true), CMINUS(54, 50, true), D(49, 0, false);

	private int high;
	private int low;
	@SuppressWarnings("unused")
	private boolean pass;

	/**
	 * Constructor for the "Grade" enumeration.
	 * 
	 * @param high - The upper bound required for the grade.
	 * @param low  - The lower bound required for the grade.
	 * @param pass - Whether it is a passing grade.
	 * @author 18010426
	 */

	private Grade(int high, int low, boolean pass) {
		this.high = high;
		this.low = low;
		this.pass = pass;
	}

	/**
	 * Get method for the boolean "pass". Determines whether the grade is a passing
	 * grade or not depending on whether it is above 50.
	 * 
	 * @return - Returns false (failing) for under 50, true (passing) for over 50.
	 * @author 18010426
	 */
	public boolean isPass() {
		if (getLow() < 50) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Get method for the integer "high".
	 * 
	 * @return - Returns an integer, which is the upper bound for the grade
	 * @author 18014026
	 */
	public int getHigh() {
		return high;
	}

	/**
	 * Get method for the integer "low".
	 * 
	 * @return - Returns an integer, which is the lower bound for the grade.
	 * @author 18014026
	 */
	public int getLow() {
		return low;
	}

	/**
	 * ToString method which overrides the standard Object ToString method.
	 * 
	 * @return - When the class is called a string is returns details.
	 * @author 18014026
	 */
	@Override
	public String toString() {
		return (this.high + "is the upper bound, " + this.low + "is the lower bound. It is a " + this.isPass()
				+ "grade.");
	}

}