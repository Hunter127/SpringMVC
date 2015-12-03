package rml.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import rml.model.MUser;
import rml.service.MUserService;

@Controller
@RequestMapping("/muserController")
public class MUserController {
	private MUserService muService;

	public MUserService getMuService() {
		return muService;
	}

	@Autowired
	public void setMuService(MUserService muService) {
		this.muService = muService;
	}
	@RequestMapping(value="/listUser")
	public String listUser(HttpServletRequest request){
		List<MUser> list = muService.getAll();
		request.setAttribute("userlist", list);
		return "listUser";
	}
	@RequestMapping(value="/addUser")
	public String addUser(MUser mUser){
		String id = UUID.randomUUID().toString();
		System.out.println(id);
		mUser.setId(id);
		muService.insert(mUser);
		return "redirect:/muserController/listUser.do";
	}
	@RequestMapping(value="/deleteUser")
	public String deleteUser(String id){
		muService.delect(id);
		return "redirect:/muserController/listUser.do";
	}
	@RequestMapping(value="/updateUserUI")
	public String updateUserUI(String id,HttpServletRequest request){
		MUser mUser = muService.selectByPrimaryKey(id);
		request.setAttribute("user", mUser);
		return "updateUser";
	}
	@RequestMapping(value="/updateUser")
	public String updateUser(MUser mUser){
		muService.update(mUser);
		return "redirect:/muserController/listUser.do";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
