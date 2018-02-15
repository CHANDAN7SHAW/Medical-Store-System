package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import medical.Purchase;
import beans.Customer;
import beans.Login;
import beans.Supplier;
import dbconfig.Dbcon;

public class Dao {
	private static Connection con;
	private static boolean status;
	private static ResultSet res;
	private static PreparedStatement ps;
	static{
		con=Dbcon.getCon();
	}

	
	public static boolean isLoginOk(Login l){
		try{
			ps=con.prepareStatement("select * from auth where user_id =? and password=?");
			ps.setString(1,l.getUser_id());
			ps.setString(2,l.getPassword());
			res=ps.executeQuery();
			if(res.next())
				status=true;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				ps.close();
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return status;
	}
	
	
	
	public static boolean isSupplierExists(Supplier s){
		
		try{
			System.out.println("in isExists");
			ps=con.prepareStatement("select * from supplier where s_email =? or s_ph_no=?");
			ps.setString(1,s.getS_email());
			ps.setString(2,s.getS_ph_no());
			res=ps.executeQuery();
			if(res.next())
				return true;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				ps.close();
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return false;
		
		
	}
	
	public static boolean insertSupplier(Supplier s){
		
		try{
			System.out.println(s);
			if(!Dao.isSupplierExists(s)){
				ps=con.prepareStatement("insert into supplier values(?,?,?,?,?)");
				ps.setString(1,s.getS_id());
				ps.setString(2,s.getS_name());
				ps.setString(3,s.getS_email());
				ps.setString(4,s.getS_ph_no());
				ps.setString(5,s.getS_vat_no());
				if(ps.executeUpdate()>0)
					status=true;
				
			}	
			else
				status=false;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				ps.close();
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return status;
	}
	
	
	
	public static boolean isStockExists(beans.Purchase p){
		
		try{
			System.out.println("in isExists");
			ps=con.prepareStatement("select * from stock_details where st_id =?");
			ps.setString(1,p.getSt_id());
			res=ps.executeQuery();
			if(res.next())
				return true;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				ps.close();
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return false;
		
		
	}
	
	public static boolean insertStock(beans.Purchase p){
		
		try{
			System.out.println(p);
			if(!Dao.isStockExists(p)){
				ps=con.prepareStatement("insert into stock_details values(?,?,?,?,?,?,?)");
				ps.setString(1,p.getSt_id());
				ps.setString(2,p.getSt_id());
				ps.setString(3,p.getM_name());
				ps.setString(4,p.getBatch_no());
				ps.setString(5,p.getComp_name());
				ps.setString(4,p.getCost_price());
				ps.setString(4,p.getMrp());
				ps.setString(4,p.getNo_of_boxes());
				if(ps.executeUpdate()>0)
					status=true;
				
			}	
			else
				status=false;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				ps.close();
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return status;
	}
	
	
	
	public static boolean isCustomerExists(Customer c){
		
		try{
			System.out.println("in isExists");
			ps=con.prepareStatement("select * from customer where c_ph_no =?");
			ps.setString(2,c.getC_ph());
			res=ps.executeQuery();
			if(res.next())
				return true;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				ps.close();
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return false;
		
		
	}
	
	public static boolean insertCustomer(Customer s){
		
		try{
			System.out.println(s);
			if(!Dao.isCustomerExists(s)){
				ps=con.prepareStatement("insert into customer values(?,?,?,?)");
				ps.setString(1,s.getC_ph());
				ps.setString(2,s.getC_name());
				ps.setString(3,s.getC_email());
				ps.setString(5,s.getC_address());
				if(ps.executeUpdate()>0)
					status=true;
				
			}	
			else
				status=false;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try {
				ps.close();
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return status;
	}
	
	
}
