package sybex.AssessmentTest.Question5;

public class Book {
	public static void main (String ...argv){
		Book book1 =  new Book();
		book1.ISBN = 1;
		Book book2 =  new Book();
		System.out.println(book1.equals(book2));
	}
	
	private int ISBN;
	private String title, author;
	private int pageCount;

	public int hashCode() {
		return ISBN;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Book)) {
			return false;
		}
		Book other = (Book) obj;
		return this.ISBN == other.ISBN;
	}
}