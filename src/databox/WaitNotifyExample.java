package databox;

public class WaitNotifyExample {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ThreadA threadA = new ThreadA(dataBox);
		ThreadB threadB = new ThreadB(dataBox);
		
		threadA.start();
		threadB.start();
	}	
}