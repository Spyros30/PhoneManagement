package com.CNassets.phones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CNassets.phones.entity.Abroad;

@Repository("abroadRepository")
public interface AbroadRepository extends JpaRepository<Abroad, Integer> {

}
