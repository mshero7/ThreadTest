package yieldTest;

public class ThreadB extends Thread{
	public boolean work = true;
	public boolean stop = false;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB �۾� ����");
			} else {
				System.out.println("B�� yield");
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
	}
	
}
