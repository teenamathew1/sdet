package JavaActivity4;

abstract class Book {
	String title;
	//Abstract method
	abstract void setTitle(String t);
	
	String getTitle() {
		return title;
	}	
}

class MyBook extends Book {
	
	public void setTitle(String t)
	{
		title = t;
	}
}

//Abstract Class activity
public class Activity2_1 {

	public static void main(String[] args) {
			
		String title ="Bible";
		Book myBook = new MyBook();
		myBook.setTitle(title);

		//Get the name of book
		System.out.println(" The title of the book is: "+ myBook.getTitle());
	}

}
