package ssm.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ssm.demo.model.Teacher;
import ssm.demo.service.ITeacherService;

@Controller
@RequestMapping("/teacher")
public class UserController {

	@Resource
	private ITeacherService teacherService;

	@RequestMapping("/showTeacher")
	public String toIndex(HttpServletRequest request, Model model) {
		int teacherId = Integer.parseInt(request.getParameter("id"));
		Teacher teacher = this.teacherService.getTeacherById(teacherId);
		model.addAttribute("teacher", teacher);
		return "showTeacher";
	}

}
