package ssm.demo.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ssm.demo.model.Teacher;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
// 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestTeacherService {

	private static Logger logger = Logger.getLogger(TestTeacherService.class);
	@Resource
	private ITeacherService teacherService = null;

	private ApplicationContext ac = null;

	@Test
	public void test1() {
		System.out.println(teacherService);
		Teacher teacher = teacherService.getTeacherById(1);
		logger.info(JSON.toJSONString(teacher));
	}
}
