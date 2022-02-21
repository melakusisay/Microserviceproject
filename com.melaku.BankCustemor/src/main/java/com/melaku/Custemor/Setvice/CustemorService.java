package com.melaku.Custemor.Setvice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.melaku.Custemor.Model.Custemor;
import com.melaku.Custemor.Repository.CustemorRepository;
import com.melaku.Custemor.VO.Product;
import com.melaku.Custemor.VO.ResponceTemplateVO;


@Service
public class CustemorService {
	@Autowired
	private CustemorRepository CustRepo;
	private Product prodvo;
	@Autowired
	private RestTemplate restTemplate;
	
	public Custemor saveCustemor(Custemor custemor) {
		return  CustRepo.save(custemor);
	}
	public Custemor findCustemorById(Long custemorid) {	
		return CustRepo.findByCustemorId(custemorid);
	}
	
	public ResponceTemplateVO getCustemorWithProduct(Long custemorid) {
		ResponceTemplateVO vo=new ResponceTemplateVO();
		Custemor custemor = CustRepo.findByCustemorId(custemorid);
		
		Product product = 
		restTemplate.getForObject("url: http://http://localhost:8082/products" + 
			 prodvo.getProductid() ,Product.class);
             vo.setCustvo(custemor);
             vo.setProductvo(product);
		     return vo;
	  }
	
	}
	 
    
     
		
	


