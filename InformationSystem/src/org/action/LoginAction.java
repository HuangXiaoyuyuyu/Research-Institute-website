package org.action;

import org.dao.LoginDao;
import org.vo.Login;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<Login>{
	private Login login;
	private LoginDao loginDao;
	@Override
	public Login getModel() {
		// TODO Auto-generated method stub
		return login;
	}
	public LoginAction() {
		super();
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	public LoginDao getLoginDao() {
		return loginDao;
	}
	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}
	
	public String login(){
		Login login1 = loginDao.checkLogin(login.getName(),login.getPassword());
		if(login1.getRole()==0){
			return "commomSuccess";
		}else if(login1.getRole()==1){
			return "managerSuccess";
		}else{
			return ERROR;
		}
	}

}
