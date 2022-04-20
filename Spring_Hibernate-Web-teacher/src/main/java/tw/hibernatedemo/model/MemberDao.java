package tw.hibernatedemo.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tw.hibernatedemo.util.HibernateUtil;

@Repository
public class MemberDao {
	@Autowired
	private SessionFactory factory;
	
	//§ï¥ÎAutoWired
//	public MemberDao() {
//		this.factory = HibernateUtil.getSessionFactory();
//	}
	
	public Member findByNameAndPassword(String loginName, String loginPwd) {
		Session session = factory.getCurrentSession();
		
		String hql = "from Member m where m.memberName = :name and m.memberPwd = :pwd";
		
		try {
			Member result = session.createQuery(hql, Member.class)
					.setParameter("name", loginName)
					.setParameter("pwd", loginPwd)
					.getSingleResult();
			if(result != null) {
				return result;
			}
			
		}catch(Exception e) {
			return null;
		}
		
		return null;
	}

}
