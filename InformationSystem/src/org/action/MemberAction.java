package org.action;

import java.util.List;
import java.util.Map;

import org.dao.MemberDao;
import org.vo.Member;
import org.vo.News;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MemberAction extends ActionSupport{
	private Member member;
	private MemberDao memberDao;
	public MemberAction() {
		super();
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public MemberDao getMemberDao() {
		return memberDao;
	}
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public String queryAllMember() throws Exception{
		List list = memberDao.queryAllMember();
		Map session = (Map) ActionContext.getContext().get("session");
		session.put("memberlist", list);
		return SUCCESS ;
	}
	
	public String selectMember() throws Exception{
		Member m = memberDao.selectMember(member.getId());
		if(m==null){
			return INPUT;
		}
		Map session = (Map) ActionContext.getContext().get("session");
		session.put("onemember", m);
		return SUCCESS;
	}
	
	public String addMember() throws Exception {
		Member m = new Member();
		m.setId(member.getId());
		m.setName(member.getName());
		m.setPic(member.getPic());
		
		memberDao.addMember(m);
		queryAllMember();
		return SUCCESS;
	}
	
	public String deleteMember() throws Exception{
		memberDao.deleteMember(member.getId());
		queryAllMember();
		return SUCCESS;
	}
	
	public String updateMember() throws Exception{
		Member m = (Member)memberDao.selectMember(member.getId());
		if(m==null){
			return INPUT;
		}
		m.setId(member.getId());
		m.setName(member.getName());
		m.setPic(member.getPic());
		memberDao.updateMember(m);
		queryAllMember();
		return SUCCESS;
		
	}
}
