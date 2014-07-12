package framework;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhou.framework.dao.IBaseDao;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationcontext.xml"})
//@ContextConfiguration(locations = {"classpath:applicationcontext.xml"})
public class TestDao {
	
	private IBaseDao iBaseDao;
	public IBaseDao getBaseDao() {
		return iBaseDao;
	}
	@Resource
	public void setBaseDao(IBaseDao baseDao) {
		this.iBaseDao = baseDao;
	}
	@Test
	public void testadd()
	{
		System.out.println("start test...");

	}
	//@Test
	public void testFind()
	{
		
	}
}
