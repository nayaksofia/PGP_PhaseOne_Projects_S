package assistedpractice3_1;

//  Writing a program in Java by extending the Thread class

public class MyThread extends Thread{
	
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
    }


	public static void main(String[] args) {
		{
	  		MyThread mt = new  MyThread();
	  		mt.start();
	 	}

	}

}
