package com.cg.lab8.exercise2;

import java.util.Calendar;
import java.text.SimpleDateFormat;
public class DisplayTimer implements Runnable
{

	
	public void run()
	{
		
	     SimpleDateFormat sm=new SimpleDateFormat("hh:mm:ss");
	    while(true)
	    {
	    	try {
	    	Calendar cal=Calendar.getInstance();
	     System.out.println(sm.format(cal.getTime()));
	     
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }
	}
	public static void main(String []args)
	{
	    DisplayTimer obj=new DisplayTimer();
		Thread obj1=new Thread(obj);
		  obj1.start();
	}

}
