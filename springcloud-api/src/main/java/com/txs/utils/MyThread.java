package com.txs.utils;

public class MyThread extends Thread{

	@Override
	public void run() {
		 super.run();
	        for(int i=0; i<1000; i++){
	            i++;
            System.out.println("i="+(i+1));
	        }
	}
	
	

}
