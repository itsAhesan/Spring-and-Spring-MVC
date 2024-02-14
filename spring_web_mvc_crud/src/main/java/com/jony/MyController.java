package com.jony;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jony.ModelDao.ModelDao;
import com.jony.modelDto.ModelDto;

@Controller
public class MyController {
	
	@Autowired
	private ModelDao dao;
	
		
	@RequestMapping("/link1")
	public String link1(){
		return "res1";
	}
	
	
	
	
	@RequestMapping("/link2")
	public ModelAndView link2(){		//======READ======
		
		
		List<ModelDto> read = dao.read();
		
		
		System.out.println(read);
		
		return new ModelAndView("res2", "user", read);
	}
	
	
	
	@RequestMapping("/reg")
	public String reg(@ModelAttribute ModelDto dto){
		System.out.println(dto);
		
		dao.save(dto);
		return "res3";
	}
	
	
	@RequestMapping(value="/Delete/{id}")
	public String delete(@PathVariable int id){
		
		System.out.println(id);
		
		dao.delete(id);
		
		
		return "res4";
	}	
	
	
	
	
	@RequestMapping(value="/Edit/{id}")			//=======EDIT========
	public ModelAndView edit(@PathVariable int id){
		ModelDto edit = dao.edit(id);
		System.out.println(edit);
		return new ModelAndView("res5", "edit1", edit);
	}
	
	
	
	@RequestMapping( value= "/sav" )		//======Update=====
	public String sav(@ModelAttribute ModelDto dto){
		System.out.println(dto);
		
		dao.update(dto);
		return "res6";
		
		}
	
	
	
	
	
	
	
	
	
		/*@RequestMapping("/sav")
		public ModelAndView sav(@ModelAttribute ModelDto dto){
			System.out.println(dto);
			
			return new ModelAndView("res7", "save", dto);
	}*/
	
	/*@RequestMapping(value ="/sav", method= RequestMethod.POST)		 // ===== Save =====
	public String sav(@ModelAttribute ModelDto dto){
		
		
		System.out.println(dto);
		
		
		
		
		return "res6";  
		}*/
		
	//@RequestMapping(value= "/sav/{id}", method= RequestMethod.POST)        // ===== Save with id=====
	/*public String sav(@PathVariable int id, @ModelAttribute ModelDto dto){
		System.out.println("IDDDD "+id);
		System.out.println(dto);
	
		dao.update(dto);
		
		
		
		return "res6";    
		}*/
	
	@RequestMapping("/login")
	public String login(){
		
		return "res6";
	}
	
	
	
	

}
