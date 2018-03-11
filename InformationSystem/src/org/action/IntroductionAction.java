package org.action;

import java.util.List;
import java.util.Map;

import org.dao.IntroductionDao;
import org.vo.Introduction;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class IntroductionAction extends ActionSupport{
	private Introduction introduction;
	private IntroductionDao introductionDao;
	public IntroductionAction() {
		super();
	}
	public Introduction getIntroduction() {
		return introduction;
	}
	public void setIntroduction(Introduction introduction) {
		this.introduction = introduction;
	}
	public IntroductionDao getIntroductionDao() {
		return introductionDao;
	}
	public void setIntroductionDao(IntroductionDao introductionDao) {
		this.introductionDao = introductionDao;
	}
	
	public String queryAllIntroduction() throws Exception{
		List list = introductionDao.queryAllIntroduction();
		Map session = (Map) ActionContext.getContext().get("session");
		
		session.put("introductionsession", list);
		return SUCCESS;
	}
	
	public String selectIntroduction() throws Exception{
		Introduction i = introductionDao.selectIntroduction(introduction.getId());
		if(i==null){
			return INPUT;
		}
		Map session = (Map) ActionContext.getContext().get("session");
		session.put("oneintroduction",i);
		return SUCCESS;
	}
	
	public String addIntroduction() throws Exception{
		Introduction i = new Introduction();
		i.setId(introduction.getId());
		i.setContent(introduction.getContent());
		
		introductionDao.addIntroduction(i);
		queryAllIntroduction();
		return SUCCESS;
	}
	
	public String deleteIntroduction() throws Exception{
		introductionDao.deleteIntroduction(introduction.getId());
		queryAllIntroduction();
		return SUCCESS;
	}
	
	public String updateIntroduction() throws Exception{
		Introduction i = (Introduction)introductionDao.selectIntroduction(introduction.getId());
		if(i==null){
			return INPUT;
		}
		i.setId(introduction.getId());
		i.setContent(introduction.getContent());
		introductionDao.updateIntroduction(i);
		queryAllIntroduction();
		return SUCCESS;
	}
}
