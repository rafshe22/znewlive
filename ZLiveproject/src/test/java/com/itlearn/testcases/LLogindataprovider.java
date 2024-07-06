package com.itlearn.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itlearn.pages.BBaseclass;
import com.itlearn.pages.LLoginpage;

import com.itlearn.utilities.RReadexcelfile;

public class LLogindataprovider extends BBaseclass {
	
	
	String filename=System.getProperty("user. dir")+"\\Testdata\\logindata.xlxs";
	@Test(dataProvider="LLogindataprovider")
	
	public void loginvrify(String username ,String password) {
		
		
		LLoginpage ww=new LLoginpage(driver);
		
		ww.login(username,password);
		
		ww.Logout();
		
		}
		
	
	
	
	
	
	
	@DataProvider
	public String [][] LLoginDataprovider() {
		
		
	
	int zzrows=RReadexcelfile.getrowcount(filename, "login");
	System.out.println(zzrows);
	int zzcolumns=RReadexcelfile.getcolcount(filename,"login");
	System.out.println(zzcolumns);
			String data [][]=new String  [zzrows][zzcolumns];
			
		
			System.out.println(zzcolumns);
			
			String Data [][]=new String[zzrows-1][zzcolumns];
			
			for(int i=1;i<zzrows;i++) {
				
				for(int j=0;j<zzcolumns;j++) 
					
				{
					
					data[i-1][j]=RReadexcelfile.getcellvalue(filename, "login", 1, j);
					
					
				}
			}
				return data;
			}
			
			
			
}
				
				
			
			
			
			
			
			
			
	
	


