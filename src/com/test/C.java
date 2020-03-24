package com.test;

public class C {
	public void demo(int a, int b, int c) {
		if (a > b) {
		if (b > c) {
		doJobA();
		return;
		}
		doJobB();
		return;
		}
		if (b > c) {
		if (a < c) {
		doJobC();
		}
		}
		}


	private void doJobB() {
		// TODO Auto-generated method stub

	}

	private void doJobC() {
		// TODO Auto-generated method stub

	}

	private void doJobA() {
		// TODO Auto-generated method stub

	}
}
