package framework;

import org.apache.catalina.core.ApplicationContext;
import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhou.framework.dao.IDepartMentDao;
import com.zhou.framework.dao.IEmployeeDao;


public class test {


	public static void main(String[] args) {
		ClassPathXmlApplicationContext act=new ClassPathXmlApplicationContext("classpath:applicationcontext.xml");
	 /*  IEmployeeDao iEmployeeDao =(IEmployeeDao) act.getBean("employeeDao");
	   Employee employee=(Employee) iEmployeeDao.findById(Employee.class, 1);
	   employee.setName("Karl_modefy");
	   iEmployeeDao.update(employee);*/
		IDepartMentDao departMentDao=(IDepartMentDao) act.getBean("departmentDao");
		
	
		
	   
	}
}
