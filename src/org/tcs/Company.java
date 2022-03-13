package org.tcs;

//child class
public class Company {
	
    public void cmpid() {
    	
    	System.out.println("Company id is 65655");
    	
		
	}
    
    public void cmpname() {
		
    	System.out.println("Company Name is tcs");
    	

	}
    
    public static void main(String[] args) {
		// Class Name Object Name = new class name ();
    	Company c = new Company();
    	//Object Name.Method Name();
    	c.cmpname();
    	c.cmpid();
    	
  
	}

	}

