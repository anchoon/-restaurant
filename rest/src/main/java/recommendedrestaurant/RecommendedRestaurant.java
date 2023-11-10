package recommendedrestaurant;

import java.math.BigDecimal;
 
public class RecommendedRestaurant {
  private int uploadId;
  private int authorId;
  private String restaurantName;
  private String location;
  private String cuisine;
  private String priceRange;
  private BigDecimal rating;
public int getUploadId() {
	return uploadId;
}
public void setUploadId(int uploadId) {
	this.uploadId = uploadId;
}
public int getAuthorId() {
	return authorId;
}
public void setAuthorId(int authorId) {
	this.authorId = authorId;
}
public String getRestaurantName() {
	return restaurantName;
}
public void setRestaurantName(String restaurantName) {
	this.restaurantName = restaurantName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getCuisine() {
	return cuisine;
}
public void setCuisine(String cuisine) {
	this.cuisine = cuisine;
}
public String getPriceRange() {
	return priceRange;
}
public void setPriceRange(String priceRange) {
	this.priceRange = priceRange;
}
public BigDecimal getRating() {
	return rating;
}
public void setRating(BigDecimal rating) {
	this.rating = rating;
}

  // Getters and setters
  // ...

  // Other methods
  // ...
}
