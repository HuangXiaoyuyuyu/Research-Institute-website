package org.dao;

import java.util.List;

import org.vo.Member;

public interface MemberDao {
	public List queryAllMember();
	public Member selectMember(Integer id);
	public void addMember(Member member);
	public void deleteMember(Integer id);
	public void updateMember(Member member);

}
