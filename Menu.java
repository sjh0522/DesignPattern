package Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	
	ArrayList<MenuComponent> menuCompenents = new ArrayList<MenuComponent>(); // 자식을 보관
	String name;
	String description;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// 자식에 대한 operation
	public void add(MenuComponent menuComponent) {
		menuCompenents.add(menuComponent);
	}
	public void remove(MenuComponent menuComponent) {
		menuCompenents.remove(menuComponent);
	}
	public MenuComponent getChild(int i) {
		return (MenuComponent) menuCompenents.get(i);
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
		
		Iterator<MenuComponent> iterator = menuCompenents.iterator(); // 자식들을 순서대로 순회, 자식들의 type이 menuItem,menu인지는 상관없음
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next(); // MenuComponent : menuItem, menu 를 공통적으로 access할 수 있는 일관된 type
			menuComponent.print(); // menuComponent의 type에 따라 각각 print() delegation
		}
	}	

}
