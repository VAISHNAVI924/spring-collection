package collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class solution {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext c1=new ClassPathXmlApplicationContext("collections/collection.xml");
		Employee e2=(Employee) c1.getBean("collection");
		System.out.println(e2);
		
System.out.println(e2.getEmployeeid().getClass());
System.out.println(e2.getEmployeename().getClass());
System.out.println(e2.getEmployeeidname().getClass());
	}

}
