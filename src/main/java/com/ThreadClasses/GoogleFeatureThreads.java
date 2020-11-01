package com.ThreadClasses;

import com.TestPages.GoogleTestPage;

public class GoogleFeatureThreads extends Thread{

	public String browserName;
	GoogleTestPage googlePage;
	
	public GoogleFeatureThreads(String threadName , String browerName){
		super(threadName);
		this.browserName = browerName;
		googlePage = new GoogleTestPage();
	}
	
	@Override
	public void run(){
		System.out.println("Thread -- started" + Thread.currentThread().getName());
		
		try{
			Thread.sleep(1000);
			googlePage.setUp(this.browserName);
			googlePage.googleSearchTest();
		}catch(Throwable e){
			e.printStackTrace();
		}finally{
			googlePage.tearDown();
		}
		
		System.out.println("Thread -- ended" + Thread.currentThread().getName());
	}
	
}
