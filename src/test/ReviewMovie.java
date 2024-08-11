package test;

public class ReviewMovie extends Review{
	String movie;

	public ReviewMovie(String body, String author, int stars, String movie) {
		super(body, author, stars);
		this.movie=movie;
	
	}
	@Override
	  public String toString() {
	    return "MovieReview{" +
	      "movie: '" + movie + '\'' +
	      ", body: '" + body + '\'' +
	      ", author: '" + author + '\'' +
	      ", stars: " + stars +
	      '}';
	  }

}
