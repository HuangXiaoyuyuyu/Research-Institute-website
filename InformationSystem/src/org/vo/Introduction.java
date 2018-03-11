package org.vo;

/**
 * Introduction entity. @author MyEclipse Persistence Tools
 */

public class Introduction implements java.io.Serializable {

	// Fields

	private Integer id;
	private String content;

	// Constructors

	/** default constructor */
	public Introduction() {
	}

	/** minimal constructor */
	public Introduction(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Introduction(Integer id, String content) {
		this.id = id;
		this.content = content;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}