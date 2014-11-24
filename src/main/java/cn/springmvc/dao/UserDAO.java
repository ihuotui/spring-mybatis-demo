package cn.springmvc.dao;

import java.util.List;

import com.github.abel533.mapper.Mapper;

import cn.springmvc.model.User;


public interface UserDAO extends Mapper<User>{

	public List<User> selectAllUser();
	
}
