package document;

public class Document {
private String text;
public Document() {
	
}
public Document(String text) {
	this.text = text;
}

public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}

public String toString()
{
    return text;
}


}
