package annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import annotation.dao.TestDao;

@Service("testService")
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;

	@Override
	public void save() {
		// TODO Auto-generated method stub
		testDao.save();
		System.out.println("testService save");
	}

}
