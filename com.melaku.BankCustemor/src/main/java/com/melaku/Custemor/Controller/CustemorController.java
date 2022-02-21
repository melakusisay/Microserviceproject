package com.melaku.Custemor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melaku.Custemor.Model.Custemor;
import com.melaku.Custemor.Setvice.CustemorService;
import com.melaku.Custemor.VO.ResponceTemplateVO;

@RestController
@RequestMapping("/custemors")
public class CustemorController {
	@Autowired
    private CustemorService custService;
   
   @RequestMapping("/hello")
   public String MK() {
		  
	   return "Hello friends this methed workd";
  }
   @PostMapping("/")
  public Custemor saveCustemor(@RequestBody Custemor custemorid) {
	  
	   return custService.saveCustemor(custemorid);
  }
   @GetMapping("/{id}")
   public ResponceTemplateVO getCustemorWithProduct(@PathVariable("id") Long custemorid) {
		  
	   return custService.getCustemorWithProduct(custemorid);
  }
}
