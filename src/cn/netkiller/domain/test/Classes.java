package cn.netkiller.domain.test;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="classes") 
public class Classes implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5422905745519948312L;
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int id; 
	private String name; 
	    
	@OneToMany(cascade=CascadeType.ALL,mappedBy="classes")    
	private Set<Student> students;

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

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "classes [id=" + id + ", name=" + name + ", students=" + students + "]";
	} 
	  
}
