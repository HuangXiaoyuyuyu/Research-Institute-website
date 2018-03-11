package org.dao;

import java.util.List;

import org.vo.Achievement;

public interface AchivevmentDao {
	public List queryAllAchievement();
	public Achievement selectAchievement(Integer id);
	public void addAchievement(Achievement achievement);
	public void deleteAchievement(Integer id);
	public void updateAchievement(Achievement achievement);
}
