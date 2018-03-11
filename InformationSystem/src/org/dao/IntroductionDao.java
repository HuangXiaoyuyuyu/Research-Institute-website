package org.dao;

import java.util.List;

import org.vo.Introduction;

public interface IntroductionDao {
	public List queryAllIntroduction();
	public Introduction selectIntroduction(Integer id);
	public void addIntroduction(Introduction introduction);
	public void deleteIntroduction(Integer id);
	public void updateIntroduction(Introduction introduction);
}
