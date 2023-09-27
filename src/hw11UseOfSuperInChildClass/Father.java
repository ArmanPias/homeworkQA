package hw11UseOfSuperInChildClass;

public class Father {
 public String name;
 public int age;
 public char sex;
 public boolean usCitizen;
 public boolean familyName;
 
 //Default Constructor
public  Father() {
	System.out.println("This is from Default Constructor -- from father-->>>");
}
 //Parameterized Constructor

public Father(String name, int age, char sex, boolean usCitizen) {
	this.name = name;
	this.age = age;
	this.sex = sex;
	this.usCitizen = usCitizen;
	System.out.println("Name: " + name + " Age:" + age + " Sex: " + sex + " Citizen status :" +usCitizen);
}
//Void type method
public void father() {
	System.out.println("This is from Void type Methood---->>>");
}
//Parameterized Method
public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
	System.out.println("Name: " + name + " Age:" + age + " Sex: " + sex + " Citizen status :" +usCitizen);
}
}
