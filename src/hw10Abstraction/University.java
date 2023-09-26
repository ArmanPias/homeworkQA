package hw10Abstraction;

public interface University extends Collage, Hospital {
	public void classSize();

	public void playGround();

	public void teacher();

	public void gymnsasium();

	public static void libary() {

	}

//One key word use call 'extends'
//Yes a interface can inherit other interface.
//Also interface cannot inherit regular or abstract class.
//It also can inherit more then one interface.		

}
