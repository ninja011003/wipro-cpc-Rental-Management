package com.wipro.hms.service;


import com.wipro.hms.bean.RentalPropertyBean;
import com.wipro.hms.dao.RentalPropertyDAO;
import com.wipro.hms.util.InvalidCityException;

public class RentalPropertyService {
	public static void main(String[] args) {
		//Write your code here
		/* 
		RentalPropertyBean bean= new RentalPropertyBean();
		RentalPropertyService obj = new RentalPropertyService();
		
		bean.setCity("chennai");
		bean.setLocation("chenn");
		bean.setNoOfBedRooms(0);
		bean.setRentalAmount(1000.45f);
		
		System.out.println(obj.addRentalProperty(bean));
		*/
		
	}

	public String addRentalProperty(RentalPropertyBean bean) {
		RentalPropertyService rService = new RentalPropertyService();
		RentalPropertyDAO rDao = new RentalPropertyDAO();
		try{
		if(bean.equals(null)){
			return "NULL VALUES IN INPUT";
		}
		if(bean.getCity().length()==0||bean.getLocation().length()==0||bean.getNoOfBedRooms()==0||bean.getRentalAmount()==0){
			return "INVALID INPUT";
		}
		
			rService.validateCity(bean.getCity());
			if(rDao.createRentalProperty(bean)==1)
				return "SUCCESS";
			else{
				return "FAILURE";
			}
		}
		catch(InvalidCityException e){
			return e.toString();
		}
		catch(NullPointerException e){
			return "NULL VALUES IN INPUT";
		}
	}

	
	public void validateCity(String city) throws InvalidCityException {
		if(!city.toLowerCase().equals("chennai")&&!city.toLowerCase().equals("bengaluru")){
			throw new InvalidCityException();
		}
	}
}
