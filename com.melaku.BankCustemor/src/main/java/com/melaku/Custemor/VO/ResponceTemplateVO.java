package com.melaku.Custemor.VO;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.melaku.Custemor.Model.Custemor;
@Entity
@Table(name = "Custemorvo")
public class ResponceTemplateVO {
	Custemor custvo;
	Product productvo;
		
	public ResponceTemplateVO(Custemor custvo, Product productvo) {
		super();
		this.custvo = custvo;
		this.productvo = productvo;
	}
	
	public ResponceTemplateVO() {
		
	}


	public Custemor getCustvo() {
		return custvo;
	}
	public void setCustvo(Custemor custvo) {
		this.custvo = custvo;
	}
	public Product getProductvo() {
		return productvo;
	}
	public void setProductvo(Product productvo) {
		this.productvo = productvo;
	}
	@Override
	public String toString() {
		return "ResponceTemplateVO [custvo=" + custvo + ", productvo=" + productvo + "]";
	}

	
  
}
