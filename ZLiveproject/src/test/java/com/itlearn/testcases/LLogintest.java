package com.itlearn.testcases;

import org.testng.annotations.Test;

import com.itlearn.pages.BBaseclass;

import com.itlearn.pages.LLoginpage;



public class LLogintest extends BBaseclass{
	
	@Test
	
public void verify() {
		
		LLoginpage ww=new LLoginpage(driver);
		String username="Demo12";
		String password="123456$";
		ww.login(username,password);
}
}


