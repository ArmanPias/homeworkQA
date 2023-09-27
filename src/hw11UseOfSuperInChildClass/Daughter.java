package hw11UseOfSuperInChildClass;

public class Daughter extends Father {
public int birthMonth;
public int age;

public Daughter() {
	super("Aru",2,'F',false);
	System.out.println("This is default Constructor");
	super.father();
	super.fatherInfo("Ara",3,'F',false);
	super.familyName =true;
	
}

public Daughter(int birthMonth, int age) {
	
	this.birthMonth = birthMonth;
	this.age = age;
	System.out.println("Birth Month :" +birthMonth + " Age :" +age+ "-->> parameterized cons" );
}
public void daughter() {
	
	System.out.println("void type Method");

}
public void daughterInfo(int birthMonth, int age){
	System.out.println("Birth Month :" +birthMonth + " Age :"+age + " parameterized methood");
	super.familyName=false;
	super.father();
	super.fatherInfo("Ari", 2, 'F', true);
	}
}



