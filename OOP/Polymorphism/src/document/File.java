package document;

public class File extends Document{
private String pathName;

public File() {
	super();
}

public File(String pathName,String text) {
	super(text);
	this.pathName = pathName;
}

public String getPathName() {
	return pathName;
}

public void setPathName(String pathName) {
	this.pathName = pathName;
}
public String toString()
{
    return super.toString()+" " +  pathName;
}
}
