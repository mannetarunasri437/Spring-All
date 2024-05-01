package com.mvn._spring_orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.mvn._spring_orm.StudentBean;

public class studentDaoImpl implements studentDao{
	 private HibernateTemplate hibernateTemplate;

	    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
	        this.hibernateTemplate = hibernateTemplate;
	    }
	@Override
	@Transactional
	public int saveStudent(StudentBean studentBean) {
		// TODO Auto-generated method stub
		  int savedetails = (Integer) hibernateTemplate.save(studentBean);
	        return savedetails;
		
		
	}

	@Override
	public StudentBean viewStudentOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStudent(StudentBean studentBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<StudentBean> studentAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
