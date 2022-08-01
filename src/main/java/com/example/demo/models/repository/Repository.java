package com.example.demo.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.productos;
//import org.springframework.stereotype.repository;

//@repository
public interface Repository extends JpaRepository<productos, Long> {

}
