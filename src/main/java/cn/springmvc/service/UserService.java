package cn.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.dao.UserDAO;
import cn.springmvc.model.User;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	public List<User> selectAll(){
		return userDAO.selectAllUser();
	}
	
}
