package src;

// WorkerThread class which contains the run method for threads and
// WorkerThread class implements Runnable interface

import java.util.ArrayList;

public class WorkerThread implements Runnable {

ArrayList<Integer> list;
static int startIndex;
int maxValueSearch=10000;
public WorkerThread(ArrayList<Integer> list) {
this.list=list;
//this.starIndex=starIndex;
}
// Run method
// In this method, when an item is found it will be printed and also has print format for searched index with its pool and related thread.
public void run(){

synchronized(this) {
while(WorkerThread.startIndex< this.list.size()) {
try {
//Thread.sleep(10);

}
catch (Exception e){}
if(list.get(WorkerThread.startIndex)==maxValueSearch) {
System.out.println("Item found " + Thread.currentThread().getName());
//WorkerThread.starIndex=Integer.MAX_VALUE;
System.exit(0);
break;
}
else {
System.out.println(" searched index "+ WorkerThread.startIndex + Thread.currentThread().getName());
}
WorkerThread.startIndex++;
}

}

}

}

