package IteratorPattern;
import java.util.Iterator;

public class Waitress {
	// Menu라는 상위클래스 type으로도 가능
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu() {
		// pancakeIterator, dinerIterator를 createIterator를 통해 생성
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		Iterator cafeIterator = cafeMenu.createIterator();

		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
		System.out.println("\nLUNCH");
		printMenu(dinerIterator);
		System.out.println("\nDESSERT");
		printMenu(cafeIterator);
	}
	
	// iterator가 순회하면서 MenuItem return
	// iterator를 사용하면 pancakeHouseMenu, dinerMenu의 자료구조에 상관없이 같은방식으로 access할 수 있음
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
