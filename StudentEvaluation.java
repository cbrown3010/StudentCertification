package assignment01;

/**
 * Test class that contains the main to trial the program using four examples
 * The transcripts of four students, Robin, Kate, Axel and Jim are populated
 * then checked through the isCertified method.
 * 
 * @author Charlie Cho 18010426
 *
 */
public class StudentEvaluation {
	/**
	 * Static as it specific to this method instead of the instances of the class
	 * Creates a new student using the constructor and assigns name Robin.
	 * Instantiates new technical school class and adds example modules as well as
	 * grades.
	 * 
	 * @return Returns the Student Class (now populated) of Robin.
	 * @author 18010426
	 */
	public static Student robin() {
		Student student = new Student("Robin");
		TechnicalSchool tech = new TechnicalSchool();
		student.addResultToTranscript(tech.lookup("PROG101"), Grade.C);
		student.addResultToTranscript(tech.lookup("DATA222"), Grade.C);
		student.addResultToTranscript(tech.lookup("INSY313"), Grade.CPLUS);
		student.addResultToTranscript(tech.lookup("WEBS332"), Grade.CPLUS);
		student.addResultToTranscript(tech.lookup("TECH103"), Grade.CPLUS);
		student.addResultToTranscript(tech.lookup("MODC233"), Grade.CMINUS);
		student.addResultToTranscript(tech.lookup("TOPG233"), Grade.CMINUS);
		student.addResultToTranscript(tech.lookup("PROJ399"), Grade.APLUS);
		return student;
	}

	/**
	 * 
	 * @return Returns the Student Class (now populated) of Kate.
	 * @author 18010426
	 */
	public static Student kate() {
		Student student = new Student("Kate");
		TechnicalSchool tech = new TechnicalSchool();
		student.addResultToTranscript(tech.lookup("PROG101"), Grade.APLUS);
		student.addResultToTranscript(tech.lookup("STAT102"), Grade.AMINUS);
		student.addResultToTranscript(tech.lookup("TECH103"), Grade.BPLUS);
		student.addResultToTranscript(tech.lookup("MODC233"), Grade.A);
		student.addResultToTranscript(tech.lookup("TOPG233"), Grade.C);
		student.addResultToTranscript(tech.lookup("DATA222"), Grade.A);
		student.addResultToTranscript(tech.lookup("INSY313"), Grade.BPLUS);
		student.addResultToTranscript(tech.lookup("WEBS332"), Grade.AMINUS);
		student.addResultToTranscript(tech.lookup("PROJ399"), Grade.B);
		student.addResultToTranscript(tech.lookup("EXTO396"), Grade.B);
		return student;
	}

	/**
	 * 
	 * @return Returns the Student Class (now populated) of Axel.
	 * @author 18010426
	 */
	public static Student axel() {
		Student student = new Student("Axel");
		TechnicalSchool tech = new TechnicalSchool();
		student.addResultToTranscript(tech.lookup("PROG101"), Grade.BPLUS);
		student.addResultToTranscript(tech.lookup("STAT102"), Grade.C);
		student.addResultToTranscript(tech.lookup("DATA222"), Grade.A);
		student.addResultToTranscript(tech.lookup("PROG202"), Grade.C);
		student.addResultToTranscript(tech.lookup("INSY313"), Grade.AMINUS);
		student.addResultToTranscript(tech.lookup("WEBS332"), Grade.A);
		student.addResultToTranscript(tech.lookup("TECH103"), Grade.D);
		student.addResultToTranscript(tech.lookup("MODC233"), Grade.B);
		student.addResultToTranscript(tech.lookup("TOPG233"), Grade.B);
		student.addResultToTranscript(tech.lookup("PROJ399"), Grade.CMINUS);
		student.addResultToTranscript(tech.lookup("EXTO396"), Grade.C);
		return student;
	}

	/**
	 * 
	 * @return Returns the Student Class (now populated) of Jim.
	 * @author 18010426
	 */
	public static Student jim() {
		Student student = new Student("Jim");
		TechnicalSchool tech = new TechnicalSchool();
		student.addResultToTranscript(tech.lookup("PROG101"), Grade.A);
		student.addResultToTranscript(tech.lookup("STAT102"), Grade.BPLUS);
		student.addResultToTranscript(tech.lookup("DATA222"), Grade.CPLUS);
		student.addResultToTranscript(tech.lookup("PROG202"), Grade.C);
		student.addResultToTranscript(tech.lookup("INSY313"), Grade.C);
		student.addResultToTranscript(tech.lookup("WEBS332"), Grade.CPLUS);
		student.addResultToTranscript(tech.lookup("TECH103"), Grade.CMINUS);
		student.addResultToTranscript(tech.lookup("THEO111"), Grade.D);
		student.addResultToTranscript(tech.lookup("MODC233"), Grade.APLUS);
		student.addResultToTranscript(tech.lookup("TOPG233"), Grade.A);
		student.addResultToTranscript(tech.lookup("LOGI321"), Grade.B);
		student.addResultToTranscript(tech.lookup("PROJ399"), Grade.BMINUS);
		student.addResultToTranscript(tech.lookup("EXTO396"), Grade.APLUS);
		return student;
	}

	/**
	 * The main method which inputs the four example students into the isCertified
	 * method to determine whether they are certified.
	 * 
	 * @param args - Standard settings for main
	 * @author 18010426.
	 */
	public static void main(String[] args) {
		TechnicalSchool tech = new TechnicalSchool();
		System.out.print("Robin: ");
		System.out.println(tech.isCertified(StudentEvaluation.robin()));
		System.out.print("Kate: ");
		System.out.println(tech.isCertified(StudentEvaluation.kate()));
		System.out.print("Axel: ");
		System.out.println(tech.isCertified(StudentEvaluation.axel()));
		System.out.print("Jim: ");
		System.out.println(tech.isCertified(StudentEvaluation.jim()));

	}
}