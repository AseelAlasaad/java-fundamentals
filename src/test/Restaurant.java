package test;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	private String name;
	private int stars;
	private int priceCategory;
	private List<Review> reviews;
	
	public Restaurant(String name,int stars, int priceCategory) {
		this.name=name;
		this.stars=stars;
		this.priceCategory=priceCategory;
		this.reviews=new ArrayList<>();
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setStars(int stars) {
		if(stars >5 || stars <0 ) {
			throw new IllegalArgumentException("Stars Must be between 0 and 5");
		}
		this.stars=stars;
	}
	private void updateRate() {
		if(reviews.isEmpty())
		{
			stars=0;
		}
		
		else {
			int totalstar=0;
			  for (Review review : reviews) {
				  
				  totalstar += review.getStars();
	            }
			  stars= totalstar/ reviews.size();
		}
	}
	
    public void addReview(Review review) {
    	if(review.getRestaurant()==this) {
    		reviews.add(review);
    		updateRate();
    	}
    }
    
  
    public List<Review> getReview(){
    	return reviews;
    }
	public String toString() {
//		return "Restaurant: " + this.name + ", Number of stars: "+  this.stars +  " , Price: "+  this.priceCategory;
		   StringBuilder result = new StringBuilder("Restaurant: " + name + ", Stars: " + stars + ", Price Category: " + "$"+priceCategory);
		   System.out.println(result);
		   result.append("\nReviews:\n");
	        for (Review review : reviews) {
	            result.append(review.toString()).append("\n");
	        }
	        return result.toString();
	}

	public int getStars() {
		// TODO Auto-generated method stub
		return this.stars;
	}
}
