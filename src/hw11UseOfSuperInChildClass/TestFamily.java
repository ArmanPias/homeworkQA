package hw11UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		Father father1 = new Father();
		System.out.println("\n parametarized constructor initialized ");
		Father father2 = new Father("Moe", 56, 'M', false);
		System.out.println("From Void type method");
		father2.father();
		System.out.println("From Parameterized method");
		father2.fatherInfo("Mohammed", 67, 'M', false);
       
        Daughter daughter1 = new Daughter();
        
        Daughter daughter2 = new Daughter(12,04);
        daughter2.daughter();
        daughter2.daughterInfo(9, 10);
        
          Daughter daughter = new Daughter();
        System.out.println("Defalult constructor initialize from parent class");
        daughter.daughterInfo(2,'M');
        daughter.familyName=true;
       
        
        
        
		
		
		
	}

}
