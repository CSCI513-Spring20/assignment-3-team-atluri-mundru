package src;

// Performing the task of searching an item in a large dataset
// In this example searching an item in a array list of size 10000
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {

public static void main(String[] args) {
// TODO Auto-generated method stub
// Initiating the thread pool size of 10
int threadPoolSize=10;
// This value is defined such that the array list is initialized with a size of 10000 later in a loop
int maxValueSearch=10000;
ArrayList<Integer> list=new ArrayList<Integer>();
Integer startIndex=new Integer(0);

for(int i=1;i<=maxValueSearch;i++)list.add(i);

ArrayList<Runnable> threads=new ArrayList<Runnable>(threadPoolSize);
// Use of ExecutorService thread pool to create and maintain a reusable pool of threads.
ExecutorService pool = Executors.newFixedThreadPool(threadPoolSize);  
for(int i=0;i<threadPoolSize;i++) {
threads.add(new WorkerThread(list));
pool.execute(threads.get(i));

}



}

}