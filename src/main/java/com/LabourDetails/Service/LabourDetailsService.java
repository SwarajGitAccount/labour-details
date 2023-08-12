package com.LabourDetails.Service;

import java.util.List;

import com.LabourDetails.Entity.LabourInfo;

public interface LabourDetailsService {

	public void saveOneLabour(LabourInfo labour);

	public List<LabourInfo> getAllList();

	public void deleteOneInfo(long id);

	public LabourInfo getLabourInfo(long id);

	

	

	

	

	

	

	

	

}
