package threadpool;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample {
	ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	
	CompletionHandler<Integer, Void> callback = 
			new CompletionHandler<Integer, Void>() {
				@Override
				public void completed(Integer result, Void attachment) {
					System.out.println("Completed() 실행 "+ result);
				}

				@Override
				public void failed(Throwable exc, Void attachment) {
					System.out.println("Completed() 실행 " + exc.toString());
				}
	};
	
	public void doWork(final String x, final String y) {
		
	}
	
	public static void main(String[] args) {
		
	}
}
