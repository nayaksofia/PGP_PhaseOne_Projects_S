package models_studentdemo;

//Sport class extends from Mark Class 

public class Sport extends Marks {
	 
	 protected float score;
	 
	 public void acceptDetails() {
			super.acceptDetails();
			System.out.print("Enter Sport Scores: ");
			this.score = scan.nextFloat();
		
		}
		
	public void displayDetails() {
			super.displayDetails();
			System.out.println("Sports Scores: " + this.score);
		}


}