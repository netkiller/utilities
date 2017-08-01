package cn.netkiller.domain.test;
//package com.example.api.domain.test;
//
//import java.io.Serializable;
//import java.util.List;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//import javax.persistence.JoinColumn;
//
//@Entity
//@Table(name = "product")
//public class Product implements Serializable {
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = -3000512675114779597L;
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
////	private int category_id;
//	private String name;
//	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY, mappedBy = "category") 
//	private List<Category> category;
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
////	public int getCategory_id() {
////		return category_id;
////	}
////
////	public void setCategory_id(int category_id) {
////		this.category_id = category_id;
////	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public List<Category> getCategory() {
//		return category;
//	}
//
//	public void setCategory(List<Category> category) {
//		this.category = category;
//	}
//
//	@Override
//	public String toString() {
//		return "Product [id=" + id + ", name=" + name + ", category=" + category + "]";
//	}
//
//}
