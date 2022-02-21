package com.melaku.Custemor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.melaku.Custemor.Model.Custemor;

@Repository
public interface CustemorRepository extends JpaRepository<Custemor, Long>{
	Custemor findByCustemorId(Long custId);
	
}
