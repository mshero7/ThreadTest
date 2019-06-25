package yieldTest;

public class ThreadA extends Thread{
	public boolean work = true;
	public boolean stop = false;
	
	@Override
	public void run() {
		int count = 1;
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업 내용");
			} else {
				System.out.println("A의 yield : "+ count);
				count++;
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}
	
}
