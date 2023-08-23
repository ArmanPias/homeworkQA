package hw3JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		System.out.println("----This all About Me---");
	
		AboutMe abm1 = new AboutMe(); //Constructor initialized
//method initialized
		System.out.println("Hi I am " + abm1.myName + "\nI am " + abm1.myAge +" years old" + "\nMy Date of Birth is "
				+ abm1.myDob + "\nMy Gender is " + abm1.myGender + "\nMy Height is " + abm1.height
				+ "\nMy Appertment rent is " + abm1.myAppertmentRent + "\nMy Yearly Income is " + abm1.myYearlyIncome
				+ "\nMy Yearly Expance is " + abm1.myYearlyExpance + "\nMy Bank Balance is " + abm1.myBankBalance + "\nLastly It is " + abm1.iAmFromBd + " I am from bangladesh");

	}

}
