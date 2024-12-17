package AllPrograms;

public class ThreadRunable implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable obj = new ThreadRunable(); //interface's obj thread
		Thread t1 = new Thread(obj, "MyThread"); //passing interface obj to Thread var
		t1.start();
//		getting name with getName of thread
		String str = t1.getName();
		System.out.println(t1.getName());
		
	}
	
	public void run() {
		System.out.println("Thread Running SUccesfully");
	}

}
