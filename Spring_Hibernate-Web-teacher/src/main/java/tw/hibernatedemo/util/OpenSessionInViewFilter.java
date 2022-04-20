package tw.hibernatedemo.util;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


@WebFilter("/OpenSessionInViewFilter")
public class OpenSessionInViewFilter implements Filter {
	
	private Session session;

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
		    SessionFactory factory = HibernateUtil.getSessionFactory();
		    this.session = factory.getCurrentSession();
		 try {
			session.beginTransaction();
			System.out.println("begin transaction");
			
			chain.doFilter(request, response);
			
			session.getTransaction().commit();
			System.out.println("transaction commit");
		}catch(Exception e) {
			session.getTransaction().rollback();
			System.out.println("Transaction rollback!!");
			e.printStackTrace();
		} finally {
			System.out.println("Session closed!");
		}
		
		
		
	}

	

}
