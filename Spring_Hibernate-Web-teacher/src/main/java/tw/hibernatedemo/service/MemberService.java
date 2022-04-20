package tw.hibernatedemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.hibernatedemo.model.Member;
import tw.hibernatedemo.model.MemberDao;

@Service
public class MemberService {
	
	@Autowired
	private MemberDao dao;
	
//	public MemberService() {
//		this.dao = new MemberDao();
//	}
	
	public Member checkLogin(String loginName, String loginPwd) {
		Member tempMember = dao.findByNameAndPassword(loginName, loginPwd);
		
		if(tempMember != null) {
			return tempMember;
		}
		
		return null;
	}

}
