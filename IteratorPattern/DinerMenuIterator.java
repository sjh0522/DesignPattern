package IteratorPattern;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator{
	
	MenuItem[] items;
	int position=0;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}	
	
	@Override
	public boolean hasNext() {
		if(position >= items.length) return false;
		else return true;
	}
	@Override
	public MenuItem next() { // public Object next()
		MenuItem menuItem = items[position];
		position++;
		return menuItem;
	}
	
}
