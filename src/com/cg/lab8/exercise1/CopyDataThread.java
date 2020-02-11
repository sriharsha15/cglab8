package com.cg.lab8.exercise1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread {
public void dispaly(String source)
{
	
	try {
	     
		FileInputStream fis=new FileInputStream(source);
		FileOutputStream fos=new FileOutputStream("target.txt");
		byte b[]=new byte[100];
        while(true)
        {	
	    fis.read(b);
	 	System.out.println("10 characters copied!");
	    Thread.sleep(1000*5);
	    fos.write(b);
	    if(fis.read()==-1)
	    {
	    	break;
	    }
	    else
	    	fos.write(b);
        }
        fis.close();
        fos.close();
		
	} 
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
}
}
