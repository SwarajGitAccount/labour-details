package com.LabourDetails.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.LabourDetails.Entity.LabourInfo;
import com.LabourDetails.Repository.LabourDetailsRepository;

@Service
public class LabourDetailsImpl implements LabourDetailsService {

	@Autowired
	private LabourDetailsRepository labourDetailsRepo;

	@Override
	public void saveOneLabour(LabourInfo labour) {
		labourDetailsRepo.save(labour);

	}

	@Override
	public List<LabourInfo> getAllList() {
		List<LabourInfo> labours = labourDetailsRepo.findAll();

		return labours;
	}

	@Override
	public void deleteOneInfo(long id) {
		labourDetailsRepo.deleteById(id);
		
	}

	@Override
	public LabourInfo getLabourInfo(long id) {
		
		Optional<LabourInfo> findById = labourDetailsRepo.findById(id);
		LabourInfo labour = findById.get();
		return labour;
		
	}
	
	

}
