package databox;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(data==null) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		System.out.println("Consumer�� ���� ������ : "+ data);
		
		data = null;
		notify();
		
		return data;
	}
	
	public synchronized void setData(String value) {
		if(data != null) {
			try {
				wait();
			} catch (Exception e) {

			}
		}
		
		data = value;
		System.out.println("Productor�� ���� ������ : "+ data);
		notify();
		
	}
}
