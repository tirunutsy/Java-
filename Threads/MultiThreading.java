package AllPrograms;

class MultiThreadingDemo extends Thread{
	public void run() {
		//Checking whether the thread is Daemon or not
		try {
			System.out.println("Thread "+Thread.currentThread().getName()+" is Running");
		}
		catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}
}

public class MultiThreading {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8; //number of Threads
		for (int i=0; i<n; i++) {
			MultiThreadingDemo obj = new MultiThreadingDemo();
			obj.start(); //Using obj for Multi Threading 
		}
	}

}
