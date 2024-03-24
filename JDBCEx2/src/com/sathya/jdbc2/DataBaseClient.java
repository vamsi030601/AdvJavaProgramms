package com.sathya.jdbc2;

public class DataBaseClient {

	public static void main(String[] args) {
		EmployeeDao employeeDao=new EmployeeDao();
		
		int res1=employeeDao.save(new EmployeeInfo(1001,"viswa",116));
        System.out.println("Data inserted successfully..."+res1);
        
        int res2=employeeDao.save(new EmployeeInfo(1002,"vamsi",119));
        System.out.println("Data inserted successfully..."+res2);
        
        EmployeeInfo emp=employeeDao.findById(1001);
        System.out.println(emp);
        
        int count=employeeDao.deleteById(1001);
        if(count==1)
        
        	System.out.println("data inserted successfully"+count);
        else
        	
        	System.out.println("data insertion fail");
        
        count=employeeDao.deleteBySalary(20000);
        if(count>0)
          System.out.println("data deleted successfully"+count);
        else
        	System.out.println("data deletion fail");
       
	}

}
