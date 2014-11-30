package om.moh.training;

public class HelloThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start waiting");
		(new HelloThread()).start();
		System.out.println("Thread Test Finished");
		System.exit(0);
	}
	 public void run() {
		    for (int i=0;i<10;i++)
	        System.out.println("Hello from a thread!");
	    }
	 


}
