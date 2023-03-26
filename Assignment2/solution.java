/*Quetion:  Producer-consumer problem, WAP on producer-consumer problem
 * using inter thread communication.
 * i) Producer must wait when queue is full until consumer consumes value
 * ii) Consumer must wait when queue is empty until producer produces a value
*/

public class solution{
	public static void main(String[] args)
		throws Exception
	{
		// Object of a class that has both produce()
		// and consume() methods
		final prd_cnsm obj = new prd_cnsm();

		// Create producer thread
		Thread t1 = new Thread(new Runnable() {
			public void run()
			{
				try {
					obj.prodc();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		// Create consumer thread
		Thread t2 = new Thread(new Runnable() {
			public void run()
			{
				try {
					obj.consm();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		// Start both threads
		t1.start();
		t2.start();

		// t1 finishes before t2
		t1.join();
		t2.join();
	}

	// This class has a list, producer (adds items to list
	// and consumer (removes items).
	public static class prd_cnsm {

		// Create a list shared by producer and consumer
		// Size of list is 2.
		int array[]= new int[3];
		int pos=0,val=0;

		// Function called by producer thread
		public void prodc() throws Exception
		{
			int val = 0;
			while (true) {
				synchronized (this)
				{
					// to insert the jobs in the list
					array[pos]=val++;
					pos++;

					// producer thread waits while list
					// is full
					while (array.length == pos+1){
						wait();
					}
					System.out.println("Produced job no: "+ val);
					// System.out.println(pos +" produce " + array[pos]);
					notify();
					Thread.sleep(100);
				}
			}
		}

		public void consm() throws Exception
		{
			while (true) {
				synchronized (this)
				{
					while (pos == 0){
						wait();
					}
					
					System.out.println("Consumed job no: " + array[pos-1]);
					// System.out.println(pos +" consume " + array[pos-1]);
						
					pos--;
					notify();
					// Thread.sleep(1000);
				}
			}
		}
	}
}

