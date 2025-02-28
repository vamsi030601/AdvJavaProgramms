package com.sathya.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class ProductDao {
	
	
	public int save(Product product)
	{
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		int count=0;
		try
		{
		 connection=DbConnection.CreateConnection();
		 preparedStatement=connection.prepareStatement("insert into product_data values(?,?,?,?,?,?,?,?)");
		 
		 preparedStatement.setString(1,product.getProId());
		 preparedStatement.setString(2,product.getProName());
		 preparedStatement.setDouble(3,product.getProPrice());
		 preparedStatement.setString(4, product.getProBrand());
		 preparedStatement.setString(5, product.getProMadeIN());
		 preparedStatement.setDate(6, product.getProMfgDate());
		 preparedStatement.setDate(7, product.getProExpDate());
		 preparedStatement.setBinaryStream(8,product.getProImage());
		 
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
	
	public static List<Product> findAll()
    {
    	List<Product> pro=new ArrayList<Product>();
    	
    	try(Connection connection1=DbConnection.CreateConnection();
    			Statement statement=connection1.createStatement())
    			{
    				ResultSet resultSet=statement.executeQuery("select * from product2");
    				
    				while(resultSet.next())
    				{
    					Product pro1=new Product();
    					
    					pro1.setProId(resultSet.getString(1));
    					pro1.setProName(resultSet.getString(2));
    					pro1.setProPrice(Double.parseDouble(resultSet.getString(3)));
    					pro1.setProBrand(resultSet.getString(4));
    					pro1.setProMadeIN(resultSet.getString(5));
    					pro1.setProMfgDate(resultSet.getDate(6));
    					pro1.setProExpDate(resultSet.getDate(7));
    					
    					pro1.setProImage(null);
    					
    					pro.add(pro1);
    					
    				}
    			}
    			catch(SQLException e)
    			{
    				e.printStackTrace();
    			}
    	return pro;
        }

}
