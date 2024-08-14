package fundamentals;

import java.util.ArrayList;

public class Shop {
	 String name;
	 String description;
	 int stars;
	 ArrayList<Review> reviews;
	
	public Shop(String name,String description, int stars)
	{
		this.name=name;
		this.description=description;
		this.stars=stars;
		reviews= new ArrayList<Review>();
		
		
	}
	
	public void addReview(Review review) {
		if(!reviews.contains(review))
		{
			 reviews.add(review);
             updateRate();
		}
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
	public String toString() {
		return "Shop{" +
	      "name:'" + name + '\'' +
	      ", description:'" + description + '\'' +
	      ", stars:" + stars +
	      '}';
	}

}
