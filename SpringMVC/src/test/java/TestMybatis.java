import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import rml.model.MUser;
import rml.service.MUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={ "classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TestMybatis {
	private static final Logger logger = Logger.getLogger(TestMybatis.class);

	private MUserService mUserService;

	public MUserService getmUserService() {
		return mUserService;
	}

	@Autowired
	public void setmUserService(MUserService mUserService) {
		this.mUserService = mUserService;
	}
	/**
	 * test insert
	 */
	@Test
	public void test1(){
		MUser mUser = new MUser();
		mUser.setId("000");
		mUser.setAge(18);
		mUser.setName("abc");
		mUser.setAddress("qqqqq");
		int i = mUserService.insert(mUser);
		logger.info(JSON.toJSONStringWithDateFormat("update " +i, "yyyy-MM-dd HH:mm:ss"));
		
	}
	
	
	 @Test
     public void test4() {
		
		MUser muser = new MUser();
		muser.setId("0000");
		muser.setName("bbbb");
		muser.setAge(1234);
		muser.setAddress("ABCD");
		int i = mUserService.delect("000");
		logger.info(JSON.toJSONStringWithDateFormat("delete "+i, "yyyy-MM-dd HH:mm:ss"));
	}
	
	
	
	
}
