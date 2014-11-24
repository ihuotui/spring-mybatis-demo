package cn.springmvc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.github.pagehelper.PageHelper;

import cn.springmvc.dao.UserDAO;
import cn.springmvc.model.User;

public class ServiceTest {
	public static void main(String args[]){
		ApplicationContext ac=new ClassPathXmlApplicationContext("conf/spring-mybatis.xml");
		UserDAO userDao= (UserDAO)ac.getBean("userDAO");

	    PageHelper.startPage(2, 5);
	    List<User> list = userDao.selectAllUser();

	    for(User user:list){
	    	System.out.println("=============User=================");
	    	System.out.println(user.getName());
	    	System.out.println(user.getAge());
	    	System.out.println("=============User=================");
	    }
	}
}