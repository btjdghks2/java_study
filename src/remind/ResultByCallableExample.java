package remind;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors() //스레드　작업큐　생성：　cpu의　최대　갯수만큼　스레드　생성
				);
		
		System.out.println("[process quest]");
		Callable<Integer> task = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				int sum =0;
				for(int i=1;i<10; i++) {
				sum += i;
			}
				return sum;
		}
			
		};
		Future<Integer> future = executorService.submit(task); //작업　처리　결과를　받을　수　있게　를　future submit 사용함
		
		try {
			int sum = future.get();
			System.out.println("process result" + sum);
			System.out.println("process end");
		} catch (Exception e) {
			System.out.println("process Exception call" + e.getMessage());
		}
		
				executorService.shutdown();

	}

}
