package org.vo;

/**
 * Achievement entity. @author MyEclipse Persistence Tools
 */

public class Achievement implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	private String content;
	private String time;

	// Constructors

	/** default constructor */
	public Achievement() {
	}

	/** minimal constructor */
	public Achievement(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Achievement(Integer id, String title, String content, String time) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}