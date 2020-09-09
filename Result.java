package assignment01;

/**
 * The Result class contains information about the grade achieved for a module.
 * It contains get and set methods for both attributes, module and grade.
 * 
 * @author Charlie Cho 18010426
 *
 */
public class Result {
	private Module module;
	private Grade grade;

	/**
	 * The constructor for the result class.
	 * 
	 * @param module - the relevant module or the grade.
	 * @param grade  - the grade achieved.
	 * @author 18010426
	 */
	public Result(Module module, Grade grade) {
		this.module = module;
		this.grade = grade;
	}

	/**
	 * Get method for the module.
	 * 
	 * @return Returns the module of the result.
	 * @author 18014026
	 */
	public Module getModule() {
		return module;
	}

	/**
	 * Get method for the grade.
	 * 
	 * @return Returns the relevant grade.
	 * @author 18014026
	 */
	public Grade getGrade() {
		return grade;
	}

	/**
	 * Set method for the module.
	 * 
	 * @param module - the module of the result.
	 * @author 18014026
	 */
	public void setModule(Module module) {
		this.module = module;
	}

	/**
	 * Set method for the module.
	 * 
	 * @param grade - the relevant grade.
	 * @author 18014026
	 */
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
}
