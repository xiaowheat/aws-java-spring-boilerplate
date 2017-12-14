package models;

public class Message {

    private int id;
    private String sender;
    private String receiver;

    private boolean seen;
    
    public Message() {
    	
    }

    public Message(int id, String sender, String receiver) {
    	this.id = id;
    	this.sender = sender;
    	this.receiver = receiver;
    	
    	this.seen = false;
    }

    public int getId() {
    	return id;
    }
    
    public String getSender() {
    	return sender;
    }
    
    public String getReceiver() {
    	return receiver;
    }

    public boolean getSeen() {
        return seen;
    }

    @Override
    public String toString() {
        return String.format(
            "Message is: '%id', sender: '%s', receiver: '%s'",
            id, sender, receiver);
    }

}