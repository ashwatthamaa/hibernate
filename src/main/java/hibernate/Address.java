package hibernate;

import javax.persistence.*;

@Entity
@Table(name="ADDRESS")

public class Address {
	
	@Id
	@GeneratedValue
	@Column(name="ADDRESS_ID")
	private int id;
	
	@Column(name="ADDNAME")
	private String addName;
	
	@ManyToOne
	@JoinColumn(name="EMPLOYEE_ID")
	private Employee employee;

	public Address(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddName() {
		return addName;
	}

	public void setAddName(String addName) {
		this.addName = addName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
