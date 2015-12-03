package rml.service;

import java.util.List;

import rml.model.MUser;

public interface MUserService {
	List<MUser> getAll();
	MUser selectByPrimaryKey(String id);
	int insert(MUser muser);
	int update(MUser muser);
	int delect(String id);
}