package Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	
	ArrayList<MenuComponent> menuCompenents = new ArrayList<MenuComponent>(); // �ڽ��� ����
	String name;
	String description;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	// �ڽĿ� ���� operation
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
		
		Iterator<MenuComponent> iterator = menuCompenents.iterator(); // �ڽĵ��� ������� ��ȸ, �ڽĵ��� type�� menuItem,menu������ �������
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next(); // MenuComponent : menuItem, menu �� ���������� access�� �� �ִ� �ϰ��� type
			menuComponent.print(); // menuComponent�� type�� ���� ���� print() delegation
		}
	}	

}
