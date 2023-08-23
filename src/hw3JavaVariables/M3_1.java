package hw3JavaVariables;

public class M3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Model3 bswModel3 = new Model3();//cons
Model3 bswaModel3 = new Model3();
Model3 bswbModel3 = new Model3();//these are actual cars
System.out.println(bswModel3.wheels);
System.out.println(bswaModel3.door);
bswaModel3.dualMotor = true ;
System.out.println(bswbModel3.dualMotor);
System.out.println(bswaModel3.dualMotor);
	}

}
