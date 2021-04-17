package SingletonPattern;

public class ChocolateBoiler {
	
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;
	
	private ChocolateBoiler() {
		// 하는일이 있어도 상관없음
		this.empty = true;
		this.boiled = false;
	}
	
	// Class name이 반드시 Singleton 일 필요는 없음
	public static ChocolateBoiler getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new ChocolateBoiler();
		}
		return uniqueInstance;
	}
	
}
