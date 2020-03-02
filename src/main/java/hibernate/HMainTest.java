package hibernate;

import org.hibernate.Session;

public class HMainTest {
	public static void main(String[] args){
		Session session = null;
		Session session1 = null;
		try{
		session = HibernateUtil.createNewSession();
		session.beginTransaction();
		Employee emp = (Employee)session.get(Employee.class, new Integer(1));
		emp.setName("Rajat");
		HibernateUtil.commitTransaction(session);
		session1 = HibernateUtil.createNewSession();
		session1.beginTransaction();
		Employee emp1 = (Employee)session1.get(Employee.class, new Integer(1));
		session1.merge(emp);
		HibernateUtil.commitTransaction(session1);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
