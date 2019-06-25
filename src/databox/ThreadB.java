package databox;

public class ThreadB extends Thread{
	private DataBox dataBox;
	
	
	public ThreadB(DataBox dataBox) {
		this.dataBox = dataBox;
	}


	@Override
	public void run() {
		for(int i=0; i<10 ;i++) {
			dataBox.getData();
		}
			
	}
}