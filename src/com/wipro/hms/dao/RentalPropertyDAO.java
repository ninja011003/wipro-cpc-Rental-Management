package com.wipro.hms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.wipro.hms.bean.RentalPropertyBean;
import com.wipro.hms.util.DBUtil;



public class RentalPropertyDAO {
	private Connection connect = DBUtil.getDBConnection();
	public String generatePropertyID(String city) {
		String id=null;
		int n=-1;
		try {
			id = city.toUpperCase().charAt(0)+""+city.toUpperCase().charAt(1)+""+city.toUpperCase().charAt(2)+"";
            Statement stmt= connect.createStatement();
            ResultSet rs = stmt.executeQuery("select RENTAL_SEQ.nextval from dual");
            rs.next();
            n=rs.getInt(1);
        } catch (Exception e) {
        	//e.printStackTrace();
        }
		return id+""+n;
	}

	public int createRentalProperty(RentalPropertyBean bean) {
		RentalPropertyDAO rDao = new RentalPropertyDAO();
		bean.setPropertyId(rDao.generatePropertyID(bean.getCity()));
		try {
            PreparedStatement pre_stmt = connect.prepareStatement("insert into RENTAL_TBL values(?,?,?,?,?)");
            pre_stmt.setString(1, bean.getPropertyId());
			pre_stmt.setFloat(2, bean.getRentalAmount());
			pre_stmt.setInt(3, bean.getNoOfBedRooms());
			pre_stmt.setString(4, bean.getLocation());
			pre_stmt.setString(5, bean.getCity());
			if(pre_stmt.execute()==false)
				return 1;
        } catch (Exception e) {
           // e.printStackTrace();
			return -1;
            
        }
		return -1;
	}

	
}
