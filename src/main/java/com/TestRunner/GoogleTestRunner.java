package com.TestRunner;

import com.ThreadClasses.GoogleFeatureThreads;

public class GoogleTestRunner {

	//How to execute from command line
	//G:\Kiran\Java\eclipseWorkSpace\JavaMultiThreading>mvn exec:java -Dexec.mainClass="com.TestRunner.GoogleTestRunner" -Dchrome=2 -Dfirefox=2
	
	public static void main(String[] args) {
		
		int chromeCount = Integer.parseInt(System.getProperty("chrome"));
		int firefoxCount = Integer.parseInt(System.getProperty("firefox"));
		
		System.out.println("total chrome :"+chromeCount+" and "+"total firefox :"+firefoxCount);
		
		for(int i=0,j=0;i<chromeCount || j<firefoxCount;i++,j++){
			System.out.println("threads started ....");
			
			Thread t1 = new GoogleFeatureThreads("chrome thread", "chrome");
			t1.start();
			Thread t2 = new GoogleFeatureThreads("firefox thread", "firefox");
			t2.start();
			
			System.out.println("threads got ended ....");
		}

	}

}
