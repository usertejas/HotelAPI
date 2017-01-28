package com.hotelapi.details.webserviceController;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotelapi.details.DButils.MysqlCon;
import com.mysql.jdbc.MySQLConnection;





@RestController
@RequestMapping(value = "/service/get/hotel")
public class webcontroller {
	Logger logger = LoggerFactory.getLogger(webcontroller.class); 
	
   //http://localhost:8080/service/get/hotel/default
	@RequestMapping(value = "/default", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public String Home(){
		String Result = null;
	 logger.info("++++ReCieved request++++++++++++++++++++++++");
	 logger.debug("++++ReCieved request++++++++++++++++++++++++");
	 Result = MysqlCon.runQuery("select * from hotels");
	 
	 return Result;
	}
}
