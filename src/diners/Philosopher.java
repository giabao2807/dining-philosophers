package diners;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Philosopher extends Thread {
	public final static int THINKING = 0;
	public final static int HUNGRY = 1;
	public final static int EATING = 2;
	public static MainFram mf = new MainFram();

	// init arr philo for 5 philosopher
	final static int n = 5;
	final static Philosopher[] philosophers = new Philosopher[n];
	final static String[] st = new String[3];

	private final int i;
	private int state;
	private final Semaphore s;

	public static int[] pilStatus = new int[n];
	final static diners.Semaphore mutex = new diners.Semaphore(1, 1);

	Philosopher(int id) {
		this.i = id;
		s = new Semaphore(1);
		state = THINKING;
	}

	private Philosopher left() {
		return philosophers[(i + n - 1) % n];
	}

	private Philosopher right() {
		return philosophers[(i + 1) % n];
	}

	public static void main(String[] args) {
		// init three state
		st[0] = "Thinking";
		st[1] = "Hungry";
		st[2] = "Eating";

		// init 5 philosopher
		philosophers[0] = new Philosopher(0);
		for (int i = 1; i < n; i++) {
			philosophers[i] = new Philosopher(i);
		}
		mf.setVisible(true);

		for (int i = 0; i < n; i++)
			pilStatus[i] = 0;

		// create 5 thread for 5 philosopher
		new Thread(philosophers[0], "Philosopher 0").start();
		new Thread(philosophers[1], "Philosopher 1").start();
		new Thread(philosophers[2], "Philosopher 2").start();
		new Thread(philosophers[3], "Philosopher 3").start();
		new Thread(philosophers[4], "Philosopher 4").start();
	}

	void statusShow() {
		String status;
		if (state == THINKING) {
			status = "Thinking";
			pilStatus[i] = THINKING;
			mf.setPosition(i, THINKING);
		} else if (state == EATING) {
			status = "Eating";
			pilStatus[i] = EATING;
			mf.setPosition(i, EATING);

		} else {
			status = "Hungry";
			pilStatus[i] = HUNGRY;
			mf.setPosition(i, HUNGRY);
		}
		System.out.println("Philosopher " + i + " is " + status);
	}

	@Override
	public void run() {
		try {
			while (true) {
				statusShow();
				if (state == THINKING) {
					thinking();
					mutex.down();
					state = HUNGRY;
				} else if (state == HUNGRY) {
					test(this);
					mutex.up();
					s.acquire();
					state = EATING;
				}else 
		          {
		            eating();
		            mutex.down();
		            state = THINKING;
		            
		            test(left());  
		            test(right());
		            mutex.up();
		          }
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
    void test(Philosopher p) {
        if (p.left().state != EATING && p.state == HUNGRY &&
            p.right().state != EATING) {
            try {
                p.state = EATING; 
                p.s.release();
            } catch (Exception ex) {
                Logger.getLogger(Philosopher.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      }
	void eating() {
	      try {
	        Thread.sleep((long) Math.round(Math.random() * 5000));
	      } catch (InterruptedException e) {}
	    }

	void thinking() {
		try {
			Thread.sleep((long) Math.round(Math.random() * 5000));
		} catch (InterruptedException e) {
		}
	}
}
