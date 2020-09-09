package assignment01;

/**
 * The TechnicalSchool class has one attribute which is an array of Modules -
 * offerings. The default constructor is populated by the static method. The get
 * methods can be used to find out the modules that are offered as well as
 * relevant information. The information about corresponding mods can also be
 * found using the loop up method. Lastly the isCertifeid method determines
 * whether the student has enough credits to be certified.
 * 
 * @author Charlie Cho 18010426
 *
 */

public class TechnicalSchool {
	private Module[] offerings;

	/**
	 * Default constructor for the TechnicalSchool class. It will populate the array
	 * with preset values from the semesterOneModuleOfferings method.
	 * 
	 * @author 18014026
	 */
	public TechnicalSchool() {
		this.offerings = TechnicalSchool.semesterOneModuleOfferings();
	}

	/**
	 * Get method for the module array.
	 * 
	 * @return It will return the module array offerings, which will detail the
	 *         different modules that are taught along with the relevant
	 *         information.
	 * @author 18014026
	 */
	public Module[] getSemesterOfferings() {
		return offerings;
	}

	/**
	 * This method will look up the relevant module and information when given the
	 * paper code. It works by iterating through the module array until the code
	 * matches and then the module information is returned. The module is first
	 * instantiated as null so if the paper code is not found it will return a null
	 * value.
	 * 
	 * @param code - the paper code that the user wishes to look up information for.
	 * @return Returns the module information for the paper code inserted.
	 * @author 18014026
	 */
	public Module lookup(String code) {
		Module coresspondingMod = null;
		for (int i = 0; i < offerings.length; i++) {
			if (offerings[i].getCode().equals(code)) {
				return offerings[i];
			}
		}
		return coresspondingMod;
	}

	/**
	 * A static method that is used to populate the default constructor. A new type
	 * of Module array "mods" is created then populated with the available modules.
	 * Static is used as it is not associated with the instance of this class
	 * (offerings).
	 * 
	 * @return Returns the array of modules that has now been populated.
	 * @author 18010426
	 */

	private static Module[] semesterOneModuleOfferings() {
		Module mods[] = new Module[13];
		mods[0] = new Module(ModuleType.TAUGHT, "PROG101", "Programming", Level.ONE);
		mods[1] = new Module(ModuleType.TAUGHT, "STAT102", "Statistics", Level.ONE);
		mods[2] = new Module(ModuleType.TAUGHT, "DATA222", "Database Design", Level.TWO);
		mods[3] = new Module(ModuleType.TAUGHT, "PROG202", "Object-Oriented Programming", Level.TWO);
		mods[4] = new Module(ModuleType.TAUGHT, "INSY313", "Information Systems", Level.THREE);
		mods[5] = new Module(ModuleType.SELF_STUDY, "WEBS332", "Web Services", Level.THREE);
		mods[6] = new Module(ModuleType.SELF_STUDY, "TECH103", "Technology Applications", Level.ONE);
		mods[7] = new Module(ModuleType.SELF_STUDY, "THEO111", "Theory of Computation", Level.ONE);
		mods[8] = new Module(ModuleType.SELF_STUDY, "MODC233", "Model Checking", Level.TWO);
		mods[9] = new Module(ModuleType.SELF_STUDY, "TOPG233", "Topology", Level.TWO);
		mods[10] = new Module(ModuleType.SELF_STUDY, "LOGI321", "Logic", Level.THREE);
		mods[11] = new Module(ModuleType.PROJECT, "PROJ399", "Web App Dev", Level.THREE);
		mods[12] = new Module(ModuleType.CLIENT_PROJECT, "EXTO396", "Great Code Company", Level.THREE);
		return mods;
	}

	/**
	 * The core method determines whether the student has enough credentials to be
	 * certified. Which means three modules at level one, three modules at level
	 * two, four modules at level three and one project module. Also there are
	 * minimum requirements of self study and taught module types needed. These four
	 * criteria are checked via iterating through the results, obtaining the module
	 * type, level and success of all the results, then cross checking with the
	 * criteria.
	 * 
	 * @param student - Insert the student to check certifiation
	 * @return Returns true or false depending on certification
	 * @author 18010426
	 */
	public boolean isCertified(Student student) {
		// The criteria are all initialized to 0
		int taught = 0;
		int selfStudy = 0;
		int project = 0;
		int levelOne = 0;
		int levelTwo = 0;
		int levelThree = 0;
		boolean certified = false;
		// The result array is populated through the students transcript
		Result result[] = student.getTranscript();
		// The result array is iterated throughout it's length
		for (int i = 0; i < result.length; i++) {
			// The relevant module, level and success information is obtained through the
			// different get methods.
			boolean passed = result[i].getGrade().isPass();
			Level level = result[i].getModule().getLevel();
			ModuleType mod = result[i].getModule().getType();
			// First we make sure we only account the papers that have been passed.
			if (passed) {
				// Now we divide into three if statements, one for each level and increment the
				// criteria values if the conditions are met.
				if (level == Level.ONE) {
					// Level one is taught or self study.
					if (mod == ModuleType.SELF_STUDY || mod == ModuleType.TAUGHT) {
						levelOne++;
					}
				} else if (level == Level.TWO) {
					// Level two, at least two (more than one) must be self taught.
					levelTwo++;
					if (mod == ModuleType.TAUGHT) {
						taught++;
					}
				} else if (level == Level.THREE) {
					// Level three, at least two must be self study.
					levelThree++;
					if (mod == ModuleType.SELF_STUDY) {
						selfStudy++;
					}
				}
				// The last criteria is that at least one project module must be passed.
				if (mod == ModuleType.CLIENT_PROJECT || mod == ModuleType.PROJECT) {
					project++;
				}
			}
		}
		// Checking all the criteria
		if (project > 0 && taught > 1 && selfStudy > 1 && levelOne > 2 && levelTwo > 2 && levelThree > 3)
			certified = true;
		else
			certified = false;
		// Return result
		return certified;
	}
}