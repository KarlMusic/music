package com.zhou.framework.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="bt_user")
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(name="name")
	//@XmlElement(name="NAME")
	private String name;
	@Column
	//@XmlElement(name="PASSWORD")
	private String password;
	@Column
	//@XmlElement(name="SEX")
	private String sex;
	@Column
	//@XmlElement(name="CREATETIME")
	private String createTime;
	@Column
	//@XmlElement(name="MODEFYTIME")
	private String modefyTime;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getModefyTime() {
		return modefyTime;
	}
	public void setModefyTime(String modefyTime) {
		this.modefyTime = modefyTime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password
				+ ", sex=" + sex + ", createTime=" + createTime
				+ ", modefyTime=" + modefyTime + "]";
	}	
	
	
}
