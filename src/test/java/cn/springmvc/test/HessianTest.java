package cn.springmvc.test;

import cn.springmvc.service.hessian.HelloService;

import com.caucho.hessian.client.HessianProxyFactory;

public class HessianTest {
	public static void main(String args[]){
		try {
			String url = "http://localhost:8080/springmvc/HelloService";
			HessianProxyFactory factory = new HessianProxyFactory();
			HelloService helloService = (HelloService) factory.create(HelloService.class, url);
			helloService.sayHello("张三");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
