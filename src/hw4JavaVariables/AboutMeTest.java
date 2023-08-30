package hw4JavaVariables;



public class AboutMeTest {

 //variable are initialized
public static void main(String[] args) {
	AboutMe arman = new AboutMe ();
arman.myName = "Arman H Pias";
arman.myAge  = 23;
arman.myGender = 'M';
arman.myHieght = 6;
arman.myEmployed = true;
arman.myIncome = 2853840;
arman.iWorkAt = "TESLA";
arman.myHourlyRate = 54;
arman.myEmployeeId = 123983836l;
arman.myDailyWorkingHours = 12;
arman.aboutMe();

System.out.println("\n:------------------:");
AboutMe alex = new AboutMe ();
alex.myName ="Alex Masud";
alex.myAge = 25;
alex.myGender = 'M';
alex.myHieght = 5;
alex.myEmployed =true;
alex.myIncome = 18945;
alex.iWorkAt = "MOOG";
alex.myHourlyRate = 43;
alex.myEmployeeId = 2356524547l;
alex.myDailyWorkingHours = 8;
alex.aboutMe();





}

}	


