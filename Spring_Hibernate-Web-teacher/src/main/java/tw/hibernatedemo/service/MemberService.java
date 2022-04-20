package tw.hibernatedemo.service;

import tw.hibernatedemo.model.Member;
import tw.hibernatedemo.model.MemberDao;

public class MemberService {
	
	private MemberDao dao;
	
	public MemberService() {
		this.dao = new MemberDao();
	}
	
	public Member checkLogin(String loginName, String loginPwd) {
		Member tempMember = dao.findByNameAndPassword(loginName, loginPwd);
		
		if(tempMember != null) {
			return tempMember;
		}
		
		return null;
	}

}
