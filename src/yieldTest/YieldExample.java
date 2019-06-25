package yieldTest;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		System.out.println("동시 시작1");
		threadA.start();
		threadB.start();
		
		try { Thread.sleep(10);} catch(Exception e) {}
		threadA.work = false;
		System.out.println("A 휴식");
		
		try { Thread.sleep(10);} catch(Exception e) {}
		threadA.work = true;
		System.out.println("동시 시작2");
		
		try { Thread.sleep(10);} catch(Exception e) {}
		threadA.stop = true;
		threadB.stop = true;
	}
}
