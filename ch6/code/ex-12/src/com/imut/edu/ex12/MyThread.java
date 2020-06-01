package com.imut.edu.ex12;

public class MyThread extends Thread {
	@Override
	public void run() {
		this.setName("mode1");
		for (int i = 0;; i++) {
			try {
				System.out.println("Thread: " + i + " " + this.getName());
				sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
			}
		}
		// System.out.println("DONE! " + getName());
	}

}
