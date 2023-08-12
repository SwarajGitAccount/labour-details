package com.LabourDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LabourDetails.Entity.LabourInfo;



public interface LabourDetailsRepository extends JpaRepository<LabourInfo, Long> {

	

}
