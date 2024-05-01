package com.mvn._spring_orm.dao;

import java.util.List;

import com.mvn._spring_orm.StudentBean;

public interface studentDao {
	public int saveStudent(StudentBean studentBean);
	public StudentBean viewStudentOne(int id);
	public void updateStudent(StudentBean studentBean);
	public void deleteStudent(int id);
	public List<StudentBean>studentAll();

}
