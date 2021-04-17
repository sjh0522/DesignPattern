package Adapter;

// Turkey�� ��ġ Duck�ΰ�ó�� �� ��Ű�� ������
public class TurkeyAdapter implements Duck{ // implements Duck : target, client�� �䱸�ϴ� interface
	
	Turkey turkey; //adaptee
	
	public TurkeyAdapter(Turkey turkey) { //adaptee��ü�� �޾Ƽ� ���� 
		this.turkey = turkey;
	}

	// Client�� Duck(target) type�� API�� ȣ�� �� �� �ֵ���
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
