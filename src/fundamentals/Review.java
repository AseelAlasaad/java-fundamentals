package fundamentals;

public class Review {
	public String body;
	public String author;
	public int stars;
	
	
	public Review(String body,String author, int stars)
	{
		this.body=body;
		this.author=author;
		setStars(stars);
		
		
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
	 
	    
	public String toString() {
		return "Review: " + this.body + ", Number of stars: "+  this.stars +  " , Author: "+  this.author;
	}
	
}
