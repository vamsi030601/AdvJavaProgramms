package com.sathya.jdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {
	public int save(EmployeeInfo emp)
	{
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		int count=0;
		try
		{
		 connection=Dbconnection.CreateConnection();
		 preparedStatement=connection.prepareStatement("insert into emp values(?,?,?)");
		 
		 preparedStatement.setInt(1,emp.getEmpId());
		 preparedStatement.setString(2,emp.getEmpName());
		 preparedStatement.setDouble(3,emp.getEmpSalary());
		 count=preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
		  e.printStackTrace();	
		}
		finally
		{
			
				try
			       { 
					if(connection!=null)
					{
					connection.close();
				    }
				
					if(preparedStatement!=null)
					{
				      preparedStatement.close();
		            }
		}
		    catch (SQLException e) 
				{
							e.printStackTrace();
				}
		
	}
		         return count;
	}
	

 public EmployeeInfo findById(int empId)
 {
	 EmployeeInfo employee=null;
	 try
	 {
		Connection connection=Dbconnection.CreateConnection();
	PreparedStatement preparedStatement=connection.prepareStatement("select * from emp where Id=?");
	    {
		    preparedStatement.setInt(1,empId);
	    
		   ResultSet resultSet=preparedStatement.executeQuery();
		   if(resultSet.next())
            {
            	employee=new EmployeeInfo();
            	employee.setEmpId(resultSet.getInt(1));
            	employee.setEmpName(resultSet.getString(2));
            	employee.setEmpSalary(resultSet.getDouble(3));
            }
	    }
		}
     
	      catch(SQLException e)
	      {
	    	  e.printStackTrace();
	      }
	        return employee;
		}       	
 
 public int deleteById(int empId)
 {
	 int count=0;
	 try{Connection connection=Dbconnection.CreateConnection();
	PreparedStatement preparedStatement=connection.prepareStatement("delete from emp where Id=?");
	    {
		    preparedStatement.setInt(1,empId);
	    
		   count=preparedStatement.executeUpdate();
		  
	    }
	 }
 
      catch(SQLException e)
	      {
	    	  e.printStackTrace();
	      }
	        return count;
		}

 public int deleteBySalary(double empSalary)
		 
 {
	 int count=0;
	 try{Connection connection=Dbconnection.CreateConnection();
	PreparedStatement preparedStatement=connection.prepareStatement("delete emp where SALARY>?");
	    {
		    preparedStatement.setDouble(1,empSalary);
	    
		   count=preparedStatement.executeUpdate();
		  
	    }
	 }
 
      catch(SQLException e)
	      {
	    	  e.printStackTrace();
	      }
	        return count;
		}
      
}
 
 
	


	

		
		
	 
 
