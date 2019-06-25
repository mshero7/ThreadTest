import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
//		Thread beepThread = new Thread(()->{
//			Toolkit toolkit = Toolkit.getDefaultToolkit();
//			
//			for(int i=0 ; i<5 ;i++) {
//				toolkit.beep();
//				try {Thread.sleep(500);} catch(Exception e) {}
//			}
//		});
//		beepThread.start();
		
//		BeepTask task = new BeepTask();
//		Thread t = new Thread(task);
//		
//		t.start();
		
		BeepThread t = new BeepThread();
		t.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("¶ò");
			try { Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
