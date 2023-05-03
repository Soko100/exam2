package exam;

class thread2 extends Thread{
	public void run()
	{
		System.out.println("Ursgal "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
thread2 t1 = new thread2();
thread2 t2 = new thread2();
thread2 t3 = new thread2();

t1.setPriority(2);
t2.setPriority(5);

System.out.println("t1 thread priority : "
        + t1.getPriority());
System.out.println("t1 thread priority : "
        + t2.getPriority());

t1.run();
t2.run();
t3.run();
	}

}
