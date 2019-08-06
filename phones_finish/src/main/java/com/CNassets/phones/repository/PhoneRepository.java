package com.CNassets.phones.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CNassets.phones.entity.Phone;

@Repository("phoneRepository")
public interface PhoneRepository extends JpaRepository<Phone, Integer> {


}
