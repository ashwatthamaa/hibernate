package hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HMain {
	public static void main(String[] args){
		
		Employee emp=new Employee();
		emp.setName("Pankaj");		
		Address add1=new Address();
		add1.setAddName("Default Address 1");
		add1.setEmployee(emp);
		Address add2=new Address();
		add2.setAddName("Default Address 2");
		add2.setEmployee(emp);
		Set<Address> addSet =  new HashSet<Address>();
		addSet.add(add1);
		addSet.add(add2);
		emp.setAddresses(addSet);
		Session session=null;
		Transaction tx=null;
		try{
			session = HibernateUtil.createNewSession();
			tx=session.beginTransaction();
			session.save(emp);
		}
		catch(Exception e){
			if(tx!=null)tx.rollback();
			e.printStackTrace();
		}
		finally{
			HibernateUtil.commitTransaction(session);
		}
	}
}
