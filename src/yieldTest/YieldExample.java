package yieldTest;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		System.out.println("���� ����1");
		threadA.start();
		threadB.start();
		
		try { Thread.sleep(10);} catch(Exception e) {}
		threadA.work = false;
		System.out.println("A �޽�");
		
		try { Thread.sleep(10);} catch(Exception e) {}
		threadA.work = true;
		System.out.println("���� ����2");
		
		try { Thread.sleep(10);} catch(Exception e) {}
		threadA.stop = true;
		threadB.stop = true;
	}
}
