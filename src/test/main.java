package test;

public class main {

	public static void main(String[] args) {
		
		
		   Restaurant restaurant1 = new Restaurant("La Bella", 4, 3);
		    Restaurant restaurant2 = new Restaurant("Burger King", 3, 2);
		    Shop shop = new Shop("shop1", "shop",3);

		    // Create Reviews
		    Review review1 = new Review("Great food and service!", "John Doe", 5);
		    Review review2 = new Review("Not great.", "Bob Brown", 0);
		    Review review3 = new Review("Good value for money.", "Alice Smith", 4);

		    // Add reviews to the restaurants
		    restaurant1.addReview(review1);
		    restaurant1.addReview(review2);
		    restaurant2.addReview(review3);
		    
		    System.out.println("Star rating of " + restaurant1.getName() + ": " + restaurant1.getStars());
		    System.out.println("Star rating of " + restaurant2.getName() + ": " + restaurant2.getStars());

		    System.out.println("Review by John Doe: " + review1.getStars() + " stars");
		    System.out.println(shop.toString());
		    
		    ReviewMovie reviewMovie1= new ReviewMovie("Great movie", "John Doe", 4,"frozen");
		    ReviewMovie reviewMovie2= new ReviewMovie("bad", "John Doe", 2,"frozen");
		    ReviewMovie reviewMovie3= new ReviewMovie("not bad", "John Doe", 3,"frozen");
		    Theater theater= new Theater( "Theater", 3);
		    theater.addMovie("Frozen");
		    theater.addReview(reviewMovie1);
		    theater.addReview(reviewMovie2);
		    theater.addReview(reviewMovie3);
		    theater.addMovie("superMan");
		    
		    
		    System.out.println(theater.toString());
		    theater.printMovies();
		    

	}

}
