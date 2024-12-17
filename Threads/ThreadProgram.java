package AllPrograms;

public class ThreadProgram  extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadProgram obj = new ThreadProgram();
		obj.start();
		System.out.println("Outside Thread");
		
	}
	
	public void run() {
		System.out.println("Inside Thread");
	}
}
