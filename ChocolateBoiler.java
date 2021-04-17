package SingletonPattern;

public class ChocolateBoiler {
	
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;
	
	private ChocolateBoiler() {
		// �ϴ����� �־ �������
		this.empty = true;
		this.boiled = false;
	}
	
	// Class name�� �ݵ�� Singleton �� �ʿ�� ����
	public static ChocolateBoiler getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
	
}
