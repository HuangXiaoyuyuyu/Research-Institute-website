package org.action;

import java.util.List;
import java.util.Map;

import org.dao.AchivevmentDao;
import org.vo.Achievement;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AchievementAction extends ActionSupport{
	private Achievement achievement;
	private AchivevmentDao achievementDao;

	
	public AchievementAction() {
		super();
	}

	public Achievement getAchievement() {
		return achievement;
	}

	public void setAchievement(Achievement achievement) {
		this.achievement = achievement;
	}

	public AchivevmentDao getAchievementDao() {
		return achievementDao;
	}

	public void setAchievementDao(AchivevmentDao achievementDao) {
		this.achievementDao = achievementDao;
	}

	public String queryAllAchievement() throws Exception{
		List list = achievementDao.queryAllAchievement();
		Map session = (Map) ActionContext.getContext().get("session");
		
		session.put("list", list);
		return SUCCESS;
	}
	
	public String selectAchievement() throws Exception{
		Achievement a = achievementDao.selectAchievement(achievement.getId());
		if(a==null){
			return INPUT;
		}
		Map session = (Map) ActionContext.getContext().get("session");
		session.put("oneachievement", a);
		return SUCCESS;
	}
	
	public String addAchievement() throws Exception{
		Achievement a = new Achievement();
		a.setId(achievement.getId());
		a.setTitle(achievement.getTitle());
		a.setContent(achievement.getContent());
		a.setTime(achievement.getTime());
		
		achievementDao.addAchievement(achievement);
		queryAllAchievement();
		return SUCCESS;
	}
	
	public String deleteAchievement() throws Exception{
		achievementDao.deleteAchievement(achievement.getId());
		queryAllAchievement();
		return SUCCESS;
	}
	
	public String updateAchievement() throws Exception{
		Achievement a = (Achievement)achievementDao.selectAchievement(achievement.getId());
		if(a==null){
			return INPUT;
		}
		a.setId(achievement.getId());
		a.setTitle(achievement.getTitle());
		a.setContent(achievement.getContent());
		a.setTime(achievement.getTime());
		achievementDao.updateAchievement(a);
		queryAllAchievement();
		return SUCCESS;
	}
} 
