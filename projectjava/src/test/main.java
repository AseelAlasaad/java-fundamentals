package test;

public class main {

	public static void main(String[] args) {
		
		
		   Restaurant restaurant1 = new Restaurant("La Bella", 4, 3);
		    Restaurant restaurant2 = new Restaurant("Burger King", 3, 2);

		    // Create Reviews
		    Review review1 = new Review("Great food and service!", "John Doe", 5, restaurant1);
		    Review review2 = new Review("Not great.", "Bob Brown", 0, restaurant1);
		    Review review3 = new Review("Good value for money.", "Alice Smith", 4, restaurant2);

		    // Add reviews to the restaurants
		    restaurant1.addReview(review1);
		    restaurant1.addReview(review2);
		    restaurant2.addReview(review3);
		    
		    System.out.println("Star rating of " + restaurant1.getName() + ": " + restaurant1.getStars());
		    System.out.println("Star rating of " + restaurant2.getName() + ": " + restaurant2.getStars());

		    System.out.println("Review by John Doe: " + review1.getStars() + " stars");

	}

}
