package SingletonPattern;

public class Singleton {
	
	// private : �ܺο��� ���� ���ϵ���
	// static : getInstance()�� static method�̱� ������ �ܺο��� ����� �� �ֵ��� �ϱ� ����, Class�� ��� instance�� ������ �� �ֵ���
	// Singleton : �ڱ� �ڽ��� type�� ����ϱ� ����	
	private static Singleton uniqueInstance;
	
	// private : �ܺο��� new Singleton() ���ϵ���, new Singleton() �ϸ� conpile error �߻�
	// construct private���� ���� ���صθ� default�� public Singleton() {}; ���� �������
	private Singleton() {};
	
	// �ܺο��� new Singleton() �������ѳ��⶧���� new Singleton ��� ���, 1���� ������ֵ��� uniqueInstance ���� ���
	// Singleton ��ü�� ���� 1ȸ �����ϴ� ���� ����
	// static : Singleton ��ü ���̵� method�� ȣ���ϱ� ���� 
	//          s.getIstance() ���� Singleton.getInstance() ȣ�� �� �� �ֵ��� (Classnaem.method��)
	// Single Thread
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton(); // ���� Class���ο��� new�߱� ������ ����, �ڱ��ڽ��̱⶧���� private Singleton() ȣ�� ����
		}
		return uniqueInstance;
	}
	
	// Multi Thread 
	// Option 1
	// getInstance()�� ȣ���ϴ� thread�� 1���� ����, getInstance method�� ������ ����Ǿ������ �ٸ� thread�� ������ �� ����
	// ���� : ��Ȯ�� ����
	// ���� : 1�� thread�� ����Ҽ� �ֱ⶧���� ���ð� �����, ��������
	/*public static synchronized Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton(); 
		}
		return uniqueInstance;
	}*/
	
	// Option 2
	// private static Singleton uniqueInstance -> private static Singleton uniqueInstance = new Singleton() �� Global var�� ����
	// Singleton ��ü�� Global var�� ����Ŷ� ����
	// ���� : ��Ȯ�� ����, lock overhead ����
	// ���� : �ܺ� ��û ���� Singleton ��ü ����, �޸� ��뷮 ����, 
	//         esp) Singleton��ü size�� Ŭ��� �޸𸮰� ���ʿ��ϰ� ���� ����
	/*private static Singleton uniqueInstance = new Singleton(); // Singleton Class�� �޸𸮿� load�Ǵ� ���� instance �������
	public static Singleton getInstance() {
		return uniqueInstance;
	}*/
	
	// Option 3
	// private static Singleton uniqueInstance -> private volatile static Singleton uniqueInstance = null �� ����
	// volatile : ���� thread�� ��Ȯ�ϰ� ����(sync) shared var�� �ٶ� �� �ֵ��� ������
	// 			  A thread�� new Singleton() �ϴ��߿� B thread�� A�� new Singleton() ������ ������ �˰� 
	// 			  �ϼ����� ���� uniqueInstance var�� ����°�� java VM crash �߻��ϴ� ���� �ذ�
	// ���� : ��Ȯ�� ����
	// ���� : java 1.5 ���Ŀ��� ���� 
	/*private volatile static Singleton uniqueInstance = null; 
	public static Singleton getInstance() {
		if(uniqueInstance == null) { // read overhead �ٿ���
			synchronized(Singleton.class){
				if(uniqueInstance == null){ // lock ���� �Ŀ� 2�� ��������°� �����ϱ� ���� double-checking
					uniqueInstance = new Singleton();
				}
			} 
		}
		return uniqueInstance;
	}*/

}
