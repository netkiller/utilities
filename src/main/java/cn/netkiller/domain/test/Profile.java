package cn.netkiller.domain.test;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "profile")
public class Profile implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2500499458196257167L;
	@Id
	@OneToOne
	@JoinColumn(name = "id")
	private Users users;

	private int age;
	private String sex;
	private String email;

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Profile [users=" + users + ", age=" + age + ", sex=" + sex + ", email=" + email + "]";
	}

}
