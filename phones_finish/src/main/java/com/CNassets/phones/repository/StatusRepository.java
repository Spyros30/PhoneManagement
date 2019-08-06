package com.CNassets.phones.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CNassets.phones.entity.Status;

@Repository("statusRepository")
public interface StatusRepository extends JpaRepository<Status, Integer> {

}
