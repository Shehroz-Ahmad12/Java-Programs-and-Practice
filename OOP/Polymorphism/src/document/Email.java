package document;

public class Email extends Document {
private String sender;
private String recipient;
private String title;

public Email() {
	super();
}
public Email(String sender, String recipient, String title,String text) {
	super(text);
	this.sender = sender;
	this.recipient = recipient;
	this.title = title;
}

public String getSender() {
	return sender;
}

public void setSender(String sender) {
	this.sender = sender;
}

public String getRecipient() {
	return recipient;
}

public void setRecipient(String recipient) {
	this.recipient = recipient;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String toString()
{
    return super.toString()+" " +  sender + " " + recipient+ "  "+ title;
}

}
