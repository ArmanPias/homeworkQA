package hw11Abstraction;

public class ColumbiaUniversity extends MedicalSchool {
public void chemistry () {
	System.out.println("This is not from non-abstrac method");
}

//public abstract void biology();

//Default const
public ColumbiaUniversity() {
	System.out.println("CU");

}
//we can override a regular class to inherit abstract class.
@Override
public void anatomyLab() {
	// TODO Auto-generated method stub
	
}
@Override
public void caring() {
	// TODO Auto-generated method stub
	
}

@Override
public void lawInfo() {
	// TODO Auto-generated method stub
	
}

	
}

// one key word that is "extends" to inherit a regular class.
//A regular class can inherit regular class and inherit a abstract class by override .But a regular class cannot inherit Interface.

