package Adapter;

// Turkey를 마치 Duck인것처럼 일 시키고 싶을때
public class TurkeyAdapter implements Duck{ // implements Duck : target, client가 요구하는 interface
	
	Turkey turkey; //adaptee
	
	public TurkeyAdapter(Turkey turkey) { //adaptee객체를 받아서 보관 
		this.turkey = turkey;
	}

	// Client는 Duck(target) type의 API만 호출 할 수 있도록
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
