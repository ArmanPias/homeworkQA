package hw11Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool {
	public void biochemistryLab() {
		System.out.println("This non-abstrac method");
	}

	// Default Constructor
	public MedicalSchool() {
		System.out.println("This default constructor from abstract class");
	}

	public abstract void anatomyLab();

}
/*2 keyword use "extends"and "implements" to inherit.
 A abstract can inherit regular and abstract class.
  A abstract can inherit 2  abstract class by using implements.
 */

