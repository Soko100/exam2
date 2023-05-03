package exam;
public class Main{

public static void main(String[] args) throws InterruptedException {
	 
	System.out.println(Thread.activeCount());
	Thread.currentThread().setName("Undsen Ursgal");
	System.out.println(Thread.currentThread().getName());
	Thread.currentThread().setPriority(10);
	System.out.println(Thread.currentThread().getPriority());
	System.out.println(Thread.currentThread().isAlive());
	
	for(int i=3; i>0; i--) {
		System.out.println(i);
		Thread.sleep(2000);
	}
	System.out.println("Duuslaa. ");
	
	MyThread thread2 = new MyThread();
	thread2.start();
	System.out.println(Thread.activeCount());
	System.out.println(thread2.isAlive());
	thread2.setName("2 Dahi ursgal");
	System.out.println(thread2.getName());
	thread2.setPriority(1);
	System.out.println(thread2.getPriority());
	
	System.out.println(Thread.activeCount());
	
	MyThread thread3 = new MyThread();
	thread3.start();
	System.out.println(Thread.activeCount());
	System.out.println(thread3.isAlive());
	thread3.setName("3 Dahi ursgal");
	System.out.println(thread3.getName());
	thread3.setPriority(1);
	System.out.println(thread3.getPriority());
	
	System.out.println(Thread.activeCount());
	
}

}