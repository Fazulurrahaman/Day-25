package hit.day22;

public class ThreadDemo {

	public static void main(String[] args)throws Exception {
		Thread t = Thread.currentThread();
		t.setName("this is my main thread.. ");
		t.setPriority(10);
		System.out.println("Now thead will sleep for 5 sec....");
		met();
		System.out.println(t);
		
	}

	static void met()throws Exception{
		System.out.println("method called");
		Thread.sleep(5000);
	}
}
