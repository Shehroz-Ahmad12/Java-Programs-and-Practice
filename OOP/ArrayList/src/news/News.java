package news;

public class News {
private String newsId;
private String newsEditor;
private String newsContent;


public News() {
	
}

public News(String newsId, String newsEditor, String newsContent) {
	this.newsId = newsId;
	this.newsEditor = newsEditor;
	this.newsContent = newsContent;
}

public String getNewsId() {
	return newsId;
}

public void setNewsId(String newsId) {
	this.newsId = newsId;
}

public String getNewsEditor() {
	return newsEditor;
}

public void setNewsEditor(String newsEditor) {
	this.newsEditor = newsEditor;
}

public String getNewsContent() {
	return newsContent;
}

public void setNewsContent(String newsContent) {
	this.newsContent = newsContent;
}



}
