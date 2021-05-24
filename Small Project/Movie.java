	import java.util.*;
	class Movie {
		String movieName;
		String review;
		int rating;
		static int count=0;
		
		Movie IMDB[]= new Movie[10];
		
		public static void main(String[] args) {
			Movie M=new Movie();
			M.Io();
		}
		
		Movie addreview(String movieName, String review, int rating)
		{
			this.movieName=movieName;
			this.review=review;
			this.rating=rating;
			
			return this;
		}
		
		void Io()
		{
			int choice=0;
			do {
				Scanner sc=new Scanner(System.in);
			System.out.println("Select the choice...\n press 1 for adding review \n press 2 for searching the movie \n press 0 to exit...");
			choice=sc.nextInt();
			switch(choice) 
			{
			case 1:
			System.out.println("Enter a Movie Name: ");
			sc.nextLine();
			String movieName=sc.nextLine();
			
			System.out.println("Enter a review: ");
			String review=sc.nextLine();
			
			System.out.println("Enter a Rating");
			int rating=sc.nextInt();
			IMDB[count++]=new Movie().addreview(movieName, review, rating);
			break;
			
			case 2:
				System.out.println("Enter a Movie Name: ");
				sc.nextLine();
				String moviename=sc.nextLine();
				this.search(moviename);
				break;
			
			default:
				System.out.println("Invalid Entry");
				
			}
		}while(choice>0);
		
		}
		void search(String movieName)
		{
			for(int i=0; i<IMDB.length; i++)
			{
				if(IMDB[i]!=null) {
				if(movieName.equals(IMDB[i].movieName))
				{
					System.out.println(IMDB[i].movieName + IMDB[i].review + IMDB[i].rating);
					break;
				}}
				else
				{
					System.out.println("Movie Not Found");
					break;
				}
			}
		}
	}
