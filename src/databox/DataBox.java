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
		System.out.println("Consumer가 읽은 데이터 : "+ data);
		
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
		System.out.println("Productor가 저장 데이터 : "+ data);
		notify();
		
	}
}
