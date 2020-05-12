package com.txs.utils;

public class RunThread {

	public static void main(String[] args) {
		MyThread thread=new MyThread();
		thread.start();
		
		thread.interrupt();
		System.out.println("stop thread:"+thread.isInterrupted());

	}

}
