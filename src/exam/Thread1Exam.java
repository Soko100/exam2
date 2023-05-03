package exam;

class thread1 extends Thread{
	public void run()
	{
		System.out.println("Ursgal "+Thread.currentThread().getName());
	}
}
public class Thread1Exam{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
thread1 thread = new thread1();
thread.run();
	}

}
