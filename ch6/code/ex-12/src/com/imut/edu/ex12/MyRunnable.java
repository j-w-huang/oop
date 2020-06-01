package com.imut.edu.ex12;

public class MyRunnable implements Runnable {
	Thread thread = null;

	public MyRunnable() {
		this.thread = new Thread(null, this, "mode2");
	}

	public void start() {
		if (this.thread != null) {
			this.thread.start();
		}
	}
	
	public int getPriority() {
		return this.thread.getPriority();
	}
	
	public void setPriority(int p) {
		this.thread.setPriority(p);
	}

	@Override
	public void run() {
		for (int i = 0;; i++) {
			try {
				System.out.println("Runable: " +  i + " " + this.thread.getName());
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
