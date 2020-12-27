package org.ram.jersey.messenger.model;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement//giving clue to JAX-B to convert this to xml
public class Message {
	private long id;
	private String message;
	private Date created;
	private String author;
	//Whenever you create a constructor that takes parameters, always create a no argument
	//constructor because of xml/json conversion
	public Message() {}
	//This constructor creates new instances of the Message class
	public Message(long id, String message, String author) {
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = new Date();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
