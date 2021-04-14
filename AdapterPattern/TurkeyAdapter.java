package Adapter;

public class TurkeyAdapter implements Duck{ // implements Duck : target, client�� �䱸�ϴ� interface
	
	Turkey turkey; //adaptee
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		for(int i=0; i<5; i++) {
			turkey.fly();
		}
	}
	
}
