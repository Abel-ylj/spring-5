package cn.ylj.context.service.impl;

import cn.ylj.context.service.IUserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author : ylj
 * create at:  2022/10/11
 */
@Service
@Scope("singleton")
public class UserServiceImpl implements IUserService {
	public UserServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + " 构造函数执行...");
	}

	@Override
	public void sayHello(String msg) {
		System.out.println("[msg] say hello");
	}
}