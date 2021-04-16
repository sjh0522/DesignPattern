package IteratorPattern;

import java.util.ArrayList;

public class MenuTestDrive {

	public static void main(String[] args) {
		// Menu라는 상위클래스 type으로도 가능
		Menu pancakeHouseMenu = new PancakeHouseMenu();
		Menu dinerMenu = new DinerMenu();
		Menu cafeMenu = new CafeMenu();
        
        
        // Without iterator
        /*ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItem();
        MenuItem[] lunchItems = dinerMenu.getMenuItem();
 
		System.out.println("MENU\n----\nBREAKFAST");
    	for(int i=0; i<breakfastItems.size() ; i++) {
    		MenuItem menuItem = (MenuItem) breakfastItems.get(i);
    		System.out.print(menuItem.getName() + " ");
    		System.out.print(menuItem.getPrice() + " "); 
    		System.out.println(menuItem.getDescription() + " ");
    	}
    	System.out.println("\nLUNCH");
    	for(int i=0; i<lunchItems.length ; i++) {
    		MenuItem menuItem = (MenuItem) lunchItems[i];
    		System.out.print(menuItem.getName() + " ");
    		System.out.print(menuItem.getPrice() + " ");
    		System.out.println(menuItem.getDescription() + " ");
    	}*/     
    	 
        
        // With iterator
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
 		waitress.printMenu();

	}
}
