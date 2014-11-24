package cn.springmvc.service.hessian;

import org.springframework.stereotype.Service;

@Service("cn.springmvc.service.hessian.HelloService") 
public class HelloServiceImpl implements HelloService{

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("hello , "+name);
	}
}
