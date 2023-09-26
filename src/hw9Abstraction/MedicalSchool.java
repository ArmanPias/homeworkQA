package hw9Abstraction;


public abstract class MedicalSchool {
	public void biochemistryLab () {
		System.out.println("This non-abstrac method");	
	}
	//Default Constructor
public MedicalSchool(){
		System.out.println("This default constructor from abstract class");
}	
public abstract void  anatomyLab();


}
