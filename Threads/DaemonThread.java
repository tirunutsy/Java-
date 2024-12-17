package AllPrograms;

public class DaemonThread extends Thread{
	
	public DaemonThread(String name) {
		super(name);
	}
	
	public void run() {
		//Checking whether the thread is Daemon or not
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName()+" is a Deamon Thread");
		}
		else {
			System.out.println(getName()+" is a User Thread");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DaemonThread t1 = new DaemonThread("t1");
		DaemonThread t2 = new DaemonThread("t2");
		DaemonThread t3 = new DaemonThread("t3");
//		setting a thread obj to deamon
		t1.setDaemon(true);
//		Starting first two thread
		t1.start();
		t2.start();
		
//		Setting userthread t3 to Daemon
		t3.setDaemon(true);	
		t3.start();
	}

}
