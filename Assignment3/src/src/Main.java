package src;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


	public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int threadPoolSize=10;
			int maxValueSearch=10000;
			ArrayList<Integer> list=new ArrayList<Integer>();
			Integer startIndex=new Integer(0);
			
			for(int i=1;i<=maxValueSearch;i++)list.add(i);

			ArrayList<Runnable> threads=new ArrayList<Runnable>(threadPoolSize);
			ExecutorService pool = Executors.newFixedThreadPool(threadPoolSize);  
				for(int i=0;i<threadPoolSize;i++) {
				threads.add(new WorkerThread(list));
				pool.execute(threads.get(i));
				
			}
				
			
			
		}

	}
