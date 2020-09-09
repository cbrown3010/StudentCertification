package assignment01;

/**
 * The Module class contains all the required information about modules. It
 * contains the title, the paper code, the level and the type. It contains the
 * get and set methods of all the attributes as well as a toString method which
 * details the information about the module.
 * 
 * @author Charlie Cho 18010426
 *
 */

public class Module {
	private String title;
	private String code;
	private Level level;
	private ModuleType type;

	/**
	 * Constructor for the "Grade" enumeration.
	 * 
	 * @param type  - What type the module is.
	 * @param title - The title of the module.
	 * @param code  - The paper code for the module.
	 * @param level - The level of the module.
	 * @author 18010426
	 */
	public Module(ModuleType type, String code, String title, Level level) {
		this.title = title;
		this.code = code;
		this.level = level;
		this.type = type;
	}

	/**
	 * Get method for the string "title".
	 * 
	 * @return - Returns a string, the title of the module.
	 * @author 18014026
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Get method for the string "code".
	 * 
	 * @return - Returns a string, the paper code of the module.
	 * @author 18014026
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Get method for the integer "level".
	 * 
	 * @return - Returns an enumeration Level, the level of the module.
	 * @author 18014026
	 */
	public Level getLevel() {
		return level;
	}

	/**
	 * Get method for the integer "type".
	 * 
	 * @return - Returns an enumeration ModuleType, the type of the module.
	 * @author 18014026
	 */
	public ModuleType getType() {
		return type;
	}

	/**
	 * Set method for the string "title".
	 * 
	 * @param title - the title of the module.
	 * @author 18010426
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Set method for the string "code".
	 * 
	 * @param code - the paper code of the module.
	 * @author 18010426
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Set method for the level "level".
	 * 
	 * @param level - the level of the module.
	 * @author 18010426
	 */
	public void setLevel(Level level) {
		this.level = level;
	}

	/**
	 * Set method for the module type "type".
	 * 
	 * @param type - the type of the module.
	 * @author 18010426
	 */
	public void setType(ModuleType type) {
		this.type = type;
	}

	/**
	 * ToString method which overrides the standard Object ToString method.
	 * 
	 * @return - When the class is called a string returns a string that describes
	 *         the module. It will list the title, the code, the level and the type.
	 * @author 18014026
	 */
	@Override
	public String toString() {
		return "Module - <<Title: " + title + "Paper code: " + code + "Level: " + level + "Type: " + type + ">>";
	}

}