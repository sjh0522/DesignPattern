package Deco;

public class MainTestDrive {
	public static void main(String[] arg) {
		Character marine = new Marine();
		System.out.println(marine.getDescription());
		
		marine = new Stimpack(marine);
		marine = new Armored(marine);
		System.out.println(marine.getDescription());		
	}
}
