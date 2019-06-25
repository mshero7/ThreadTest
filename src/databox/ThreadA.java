package databox;

public class ThreadA extends Thread{
	private DataBox dataBox;
	
	
	
	public ThreadA(DataBox dataBox) {
		this.dataBox = dataBox;
	}



	@Override
	public void run() {
		for(int i=0; i<10 ;i++) {
			dataBox.setData("Data"+i);
		}
			
	}
}
