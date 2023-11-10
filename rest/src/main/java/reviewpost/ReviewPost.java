package reviewpost;

import java.sql.Date;

public class ReviewPost {
  private int postId;
  private int authorId;
  private String title;
  private String content;
  private Date createdDate;
public int getPostId() {
	return postId;
}
public void setPostId(int postId) {
	this.postId = postId;
}
public int getAuthorId() {
	return authorId;
} 
public void setAuthorId(int authorId) {
	this.authorId = authorId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Date createdDate) {
	this.createdDate = createdDate;
}

  // Getters and setters
  // ...

  // Other methods
  // ...
}
