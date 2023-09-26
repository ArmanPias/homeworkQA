package hw10Encapsulation;

public class Employee {
private  String Name;
private int age;
private char sex;
private boolean citizen;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public char getSex() {
	return sex;
}
public void setSex(char sex) {
	this.sex = sex;
}
public boolean isCitizen() {
	return citizen;
}
public void setCitizen(boolean citizen) {
	this.citizen = citizen;
}

}
