package fundamentals;

import java.util.ArrayList;

public class Theater {
	 String name;
	 int stars;
	 ArrayList<ReviewMovie> reviews;
	 ArrayList<String> movies ;
	 
	 public Theater(String name, int stars) {
		 this.name=name;
		 this.stars=stars;
		 reviews= new ArrayList<ReviewMovie>();
		 movies= new ArrayList<String>();
	 }
	 
	 public void addMovie(String movie) {
			if(!movies.contains(movie))
			{
				movies.add(movie);
			}
		}
	 public void removeMovie(String movie) {
		 if(movies.contains(movie))
			{
				movies.remove(movie);
			}
	 }
	 
		public void addReview(ReviewMovie review) {
			if(!reviews.contains(review))
			{
				 reviews.add(review);
				 updateRate();
	           
			}
		}
		
		private void updateRate() {
			if(reviews.isEmpty())
			{
				this.stars=0;
			}
			
			else {
				int totalstar=0;
				  for (Review review : reviews) {
					  
					  totalstar += review.getStars();
		            }
				  this.stars= totalstar/ reviews.size();
			}
		}
		public void printMovies() {
			for(String movie : movies)
			{
				System.out.println(movie);
			}
		}
		public String toString() {
			return "Theater{" +
		      "name:'" + name + '\'' +
		      ", stars:'" + this.stars + '\'' +
		     
		      '}';
		}

		
}
