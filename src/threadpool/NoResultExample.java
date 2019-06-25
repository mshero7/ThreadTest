package threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.naming.spi.DirStateFactory.Result;

public class NoResultExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("累诀 贸府 夸没");
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i= 1; i<1000000 ; i++) {
					String threadName = Thread.currentThread().getName();
					System.out.println("ThreadName : "+ threadName);
					sum += i;
				}
				
				System.out.println("贸府搬苞 : " + sum );
			}
		};
		
		Future future = executorService.submit(runnable);
		
		try {
			future.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
