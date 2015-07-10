package ssm.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ssm.demo.dao.ITeacherDao;
import ssm.demo.model.Teacher;
import ssm.demo.service.ITeacherService;

@Service("teacherServcie")
public class TeacherServiceImpl implements ITeacherService {

	@Resource
	private ITeacherDao teacherDao;

	public Teacher getTeacherById(long teacherId) {
		// TODO Auto-generated method stub
		return this.teacherDao.selectByPrimaryKey((long) teacherId);
	}
}
