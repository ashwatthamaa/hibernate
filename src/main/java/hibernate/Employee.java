package hibernate;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE")

public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name="EMPLOYEE_ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@OneToMany(mappedBy="employee", cascade=CascadeType.ALL)
	private Set<Address> addresses;

	public Employee(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

}
