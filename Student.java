package assignment01;

/**
 * The Student class contains information about the student including the name
 * and an array of the student's results - transcript. Aside from the standard
 * get and set methods there is an addResultToTranscript method to add the
 * relevant results to the transcript and a getTranscript method to populate
 * those results into an array for the transcript. The toString details the
 * student's information and transcript.
 * 
 * @author Charlie Cho 18014026
 * 
 */

public class Student {
	private String name;
	private int MAX_TRANSCRIPT_LENGTH = 20;
	private int numberOfResults;
	private Result[] transcript;

	/**
	 * Constructor that creates a student class using just the name. A new array of
	 * results is created in transcript, the array is limited to the maximum
	 * transcription length which is set at a final 20.
	 * 
	 * @param name - the name of the student.
	 * @author 18010426
	 */
	public Student(String name) {
		this.name = name;
		transcript = new Result[MAX_TRANSCRIPT_LENGTH];
	}

	/**
	 * An important method that allows the addition of new results to the
	 * transcript. The module and corresponding grade is inserted. A new Result
	 * class is made, it is verified that the index has not exceeded the maximum set
	 * initially (20), then the value is assigned to the relevant index and the
	 * index is incremented in preparation for the next addition.
	 * 
	 * @param mod   - the module of the result being added.
	 * @param grade - the grade of the result being added.
	 * @author 18010426
	 */
	public void addResultToTranscript(Module mod, Grade grade) {
		Result result = new Result(mod, grade);
		if (numberOfResults < MAX_TRANSCRIPT_LENGTH) {
			transcript[numberOfResults] = result;
		}
		numberOfResults++;
	}

	/**
	 * Gets the relevant transcript from the existing results. Creates a new Results
	 * array which iterates up to 20 (the maximum transcription length). The cloning
	 * only executes if the transcript still has results remaining and through
	 * incrementing both the clone and the original array all the results is
	 * transferred over. This is done so the transcript contains no nulls.
	 * 
	 * @return Returns the transcript, an array of results of the student.
	 * @author 18010426
	 */

	public Result[] getTranscript() {
		Result[] noNullTranscript = new Result[numberOfResults];
		int i = 0;
		for (int j = 0; j < MAX_TRANSCRIPT_LENGTH; j++) {
			if (transcript[j] != null) {
				noNullTranscript[i] = transcript[j];
				i++;
			}
		}
		return noNullTranscript;
	}

	/**
	 * Get method to obtain how many results exist in the student's transcript.
	 * 
	 * @return Returns the number of results
	 * @author 18010426
	 */
	public int getNResults() {
		return numberOfResults;
	}

	/**
	 * Get method to obtain the name of the student.
	 * 
	 * @return Returns the name of the student.
	 * @author 18010426
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set method to set the transcript of the student.
	 * 
	 * @param transcript - the transcript of the student.
	 * @author 18014026
	 */
	public void setTranscript(Result[] transcript) {
		this.transcript = transcript;
	}

	/**
	 * Set method to set the number of results for the student.
	 * 
	 * @param numberOfResults - sets the number of results for the student.
	 * @author 18014026
	 */
	public void setNResults(int numberOfResults) {
		this.numberOfResults = numberOfResults;
	}

	/**
	 * Set method to set the name of the student.
	 * 
	 * @param name - sets the name of the student.
	 * @author 18014026
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ToString method which overrides the standard Object ToString method.
	 * 
	 * @return - When the class is called a string is returns details of the
	 *         transcript.
	 * @author 18014026
	 */
	@Override
	public String toString() {
		return "<<Student: " + name + " has " + numberOfResults + " number of results. The transcript is: "
				+ transcript;
	}

}