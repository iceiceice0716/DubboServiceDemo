package com.yjq.dao.impl;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.yjq.base.AbstractBaseMongoTemplete;
import com.yjq.dao.IUserDao;
import com.yjq.model.User;

@Repository
public class UserDao extends AbstractBaseMongoTemplete implements IUserDao{

	public List<User> queryData() {
		//String jsonSql="{'id':1}";
		/*User user=new User();
		user.setId(4);
		user.setName("hehehe");
		user.setPwd("123");
		mongoTemplate.insert(user);
		System.out.println(user);*/
		return mongoTemplate.findAll(User.class);
	}
	public static void main(String[] args) {
		 try{     
	            // 连接到 mongodb 服务  
	             Mongo mongo = new Mongo("127.0.0.1", 27017);    
	            //根据mongodb数据库的名称获取mongodb对象 ,  
	             DB db = mongo.getDB( "MyTestDB" );  
	             Set<String> collectionNames = db.getCollectionNames();    
	               // 打印出test中的集合    
	              for (String name : collectionNames) {    
	                    System.out.println("collectionName==="+name);    
	              }    
	               
	          }catch(Exception e){  
	             e.printStackTrace();  
	          }  
	}
}
