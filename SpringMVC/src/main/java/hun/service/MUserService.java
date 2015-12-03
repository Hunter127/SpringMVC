package hun.service;

import hun.model.MUser;

import java.util.List;

public interface MUserService {
	List<MUser> getAll();
	MUser selectByPrimaryKey(String id);
	int insert(MUser muser);
	int update(MUser muser);
	int delect(String id);
}
