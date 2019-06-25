package executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTest {
	public static void main(String[] args) {
		ExecutorService exService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		class Task implements Runnable {
			//공유객체
			Result result ;
			
			
			public Task(Result result) {
				this.result = result;
			}

			
			@Override
			public void run() {
				int sum = 0;
				for(int i=0; i<=10 ;i++) {
					sum += i;
				}
				result.addValue(sum);
			}
			
		}
		
		Result result = new Result();
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		
		Future<Result> future1 = exService.submit(task1,result);
		Future<Result> future2 = exService.submit(task2, result);
		
		try {
			future1.get();
			future2.get();
			
			System.out.println("처리 결과 : "+ result.accValue);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		exService.shutdown();
	}
}

class Result {
	int accValue;
	
	synchronized void addValue(int val) {
		accValue += val;
	}
}