package org.ram.jersey.messenger.resources;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ram.jersey.messenger.model.Message;
import org.ram.jersey.messenger.service.MessageService;
//Resource Handler that makes a call to a service
//Jersey will look for a class which has this /message Path annotation
//Top level annotation
@Path("/messages")//map url to a class
public class MessageResource {
	MessageService messageService = new MessageService();
	//map a GET request to a java method
	@GET
	@Produces(MediaType.APPLICATION_XML)//return format
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
	@POST
	@Produces(MediaType.APPLICATION_XML)
	public String addMessage() {
		return "POST works!";
	}
	//Method level annotation
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_XML)
	public Message getMessage(@PathParam("messageId")long id) {
		return messageService.getMessage(id);	
	}
	
}
