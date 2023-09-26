package hw10Abstraction;

public abstract class MedicalSchool extends NursingSchool {
	public void biochemistryLab() {
		System.out.println("This non-abstrac method");
	}

	// Default Constructor
	public MedicalSchool() {
		System.out.println("This default constructor from abstract class");
	}

	public abstract void anatomyLab();

}
//One keyword use "extends" to inherit.
// A abstract can inherit regular and abstract class.
// A abstract can inherit only one abstract class.

/*
 * ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and
 * NursingSchool. how many keywords are used for the inheritance in Java for
 * Abstract Class? Can an Abstract Class inherit another Abstract Class or a
 * regular class or interface by extends keyword? How many inheritances are
 * possible in an Abstract Class? (use java comments for the above question) Use
 * one of the above Abstract classes (MedicalSchool extends NursingSchool) and
 * use the keywords to answer my questions.
 */