package cn.netkiller.domain.test;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6737037465677800326L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;

	// 若有多个cascade，可以是：{CascadeType.PERSIST,CascadeType.MERGE}
	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "class_id") // student类中对应外键的属性：class_id
	private Classes classes;

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

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", classes=" + classes + "]";
	}

}
