package com.zhou.framework.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="bt_user")
public class Music {

	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Id;
	@Column(name="name")
	private String name;
	@Column(name="author")
	private String author;
	@Column(name="filePath")
	private String filePath;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	@Override
	public String toString() {
		return "Music [Id=" + Id + ", name=" + name + ", author=" + author
				+ ", filePath=" + filePath + "]";
	}
}
