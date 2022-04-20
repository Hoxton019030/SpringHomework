package tw.hibernatedemo.service;

import java.util.List;

import tw.hibernatedemo.model.CompanyBean;

public interface CompanyServiceInterface {
	
	CompanyBean select(int id);
	List<CompanyBean> selectAll();
	CompanyBean insert(CompanyBean comBean);
	CompanyBean updateOne(int comId, String comName);
    boolean delete(int comId);
}
