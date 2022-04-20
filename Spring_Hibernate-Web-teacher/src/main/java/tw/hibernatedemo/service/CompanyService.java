package tw.hibernatedemo.service;

import java.util.List;

import org.hibernate.Session;

import tw.hibernatedemo.model.CompanyBean;
import tw.hibernatedemo.model.CompanyDao;

public class CompanyService implements CompanyServiceInterface {
	
	private CompanyDao comDao;
	
	public CompanyService(Session session) {
		this.comDao = new CompanyDao(session);
	}

	@Override
	public CompanyBean select(int id) {
		CompanyBean theCom = comDao.select(id);
		return theCom;
	}

	@Override
	public List<CompanyBean> selectAll() {
		List<CompanyBean> list = comDao.selectAll();
		return list;
	}

	@Override
	public CompanyBean insert(CompanyBean comBean) {
		CompanyBean oneCom = comDao.insert(comBean);
		return oneCom;
	}

	@Override
	public CompanyBean updateOne(int comId, String comName) {
		CompanyBean oneCom = comDao.updateOne(comId, comName);
		return oneCom;
	}

	@Override
	public boolean delete(int comId) {
		boolean result = comDao.deleteOne(comId);
		return result;
	}

}
