package SingletonPattern;

public class Singleton {
	
	// private : 외부에서 수정 못하도록
	// static : getInstance()가 static method이기 때문에 외부에서 사용할 수 있도록 하기 위해, Class의 모든 instance가 공유할 수 있도록
	// Singleton : 자기 자신의 type을 기억하기 위해	
	private static Singleton uniqueInstance;
	
	// private : 외부에서 new Singleton() 못하도록, new Singleton() 하면 conpile error 발생
	// construct private으로 생성 안해두면 default가 public Singleton() {}; 으로 만들어짐
	private Singleton() {};
	
	// 외부에서 new Singleton() 금지시켜놨기때문에 new Singleton 대신 사용, 1개만 만들수있도록 uniqueInstance 변수 사용
	// Singleton 객체를 최초 1회 생성하는 것이 목적
	// static : Singleton 객체 없이도 method를 호출하기 위해 
	//          s.getIstance() 없이 Singleton.getInstance() 호출 할 수 있도록 (Classnaem.method명)
	// Single Thread
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton(); // 같은 Class내부에서 new했기 때문에 가능, 자기자신이기때문에 private Singleton() 호출 가능
		}
		return uniqueInstance;
	}
	
	// Multi Thread 
	// Option 1
	// getInstance()를 호출하는 thread를 1개로 봉쇄, getInstance method가 완전히 종료되어야지만 다른 thread가 진입할 수 있음
	// 장점 : 정확성 보장
	// 단점 : 1개 thread만 통과할수 있기때문에 대기시간 길어짐, 성능저하
	/*public static synchronized Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton(); 
		}
		return uniqueInstance;
	}*/
	
	// Option 2
	// private static Singleton uniqueInstance -> private static Singleton uniqueInstance = new Singleton() 인 Global var로 변경
	// Singleton 객체를 Global var로 만든거랑 같음
	// 장점 : 정확성 보장, lock overhead 없음
	// 단점 : 외부 요청 없이 Singleton 객체 만듬, 메모리 사용량 높음, 
	//         esp) Singleton객체 size가 클경우 메모리가 불필요하게 많이 사용됨
	/*private static Singleton uniqueInstance = new Singleton(); // Singleton Class가 메모리에 load되는 순간 instance 만들어짐
	public static Singleton getInstance() {
		return uniqueInstance;
	}*/
	
	// Option 3
	// private static Singleton uniqueInstance -> private volatile static Singleton uniqueInstance = null 로 변경
	// volatile : 여러 thread가 정확하게 같인(sync) shared var를 바라볼 수 있도록 보장함
	// 			  A thread가 new Singleton() 하는중에 B thread가 A의 new Singleton() 수행이 끝난줄 알고 
	// 			  완성되지 않은 uniqueInstance var를 들고가는경우 java VM crash 발생하는 현상 해결
	// 장점 : 정확성 보장
	// 단점 : java 1.5 이후에만 지원 
	/*private volatile static Singleton uniqueInstance = null; 
	public static Singleton getInstance() {
		if(uniqueInstance == null) { // read overhead 줄여줌
			synchronized(Singleton.class){
				if(uniqueInstance == null){ // lock 얻은 후에 2번 만들어지는것 방지하기 위해 double-checking
					uniqueInstance = new Singleton();
				}
			} 
		}
		return uniqueInstance;
	}*/

}
