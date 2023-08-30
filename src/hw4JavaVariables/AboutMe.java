package hw4JavaVariables;


public class AboutMe { //variable are declare
public String myName;
public byte myAge;
public char myGender;
public float myHieght;
public boolean myEmployed;
public int myIncome;
public String iWorkAt;
public short myHourlyRate;
public long myEmployeeId;
public double myDailyWorkingHours;

//constructor declare
public AboutMe() {
	System.out.println("This is About me");
	
}
public void aboutMe () { 
	System.out.println( "\nMy name is " + myName+ "\nI am " + myAge + " years old " + " \nMy Gender is " + myGender +  "\nMy Hieght is " + myHieght + " feet " +  " \nIt is " + myEmployed + " I'm a full-time employee" + " at " + iWorkAt + "\nMy hourly rate is " + myHourlyRate + " USD" + "\nMy employee ID  " + myEmployeeId + "\nMy daily working hours  is " + myDailyWorkingHours);
	
}
}




