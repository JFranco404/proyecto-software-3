package com.example.LegalSys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.LegalSys.model.Municipio;



@Repository
public interface MunicipioRepository  extends JpaRepository<Municipio,Long>{


}

