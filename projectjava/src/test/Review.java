package test;

public class Review {
	private String body;
	private String author;
	private int stars;
	private Restaurant restaurant;
	
	public Review(String body,String author, int stars, Restaurant restaurant)
	{
		this.body=body;
		this.author=author;
		setStars(stars);
		this.restaurant=restaurant;
		
	}
	   public int getStars() {
	        return stars;
	    }

	    public void setStars(int stars) {
	        if (stars < 0 || stars > 5) {
	            throw new IllegalArgumentException("Stars must be between 0 and 5.");
	        }
	        this.stars = stars;
	    }
	    public Restaurant getRestaurant() {
	    	return this.restaurant;
	    }
	    
	public String toString() {
		return "Review: " + this.body + ", Number of stars: "+  this.stars +  " , Author: "+  this.author+ ":\n"+
				"restaurant name is: "+ restaurant.getName();
	}
	
}
