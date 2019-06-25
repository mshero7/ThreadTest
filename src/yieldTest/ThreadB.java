package yieldTest;

public class ThreadB extends Thread{
	public boolean work = true;
	public boolean stop = false;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB 작업 내용");
			} else {
				System.out.println("B의 yield");
				Thread.yield();
			}
		}
		System.out.println("ThreadB 종료");
	}
	
}
