package com.cg.lab8.exercise1;

import java.util.Scanner;

public class FileProgram extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String source=sc.next();
		CopyDataThread obj=new CopyDataThread();
		obj.dispaly(source);
		sc.close();
		

	}

}
