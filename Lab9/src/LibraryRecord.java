
public class LibraryRecord {
	public LibraryRecord (String title, String author, int libraryOfCongressCatalogNumber, String publisher, int year , boolean circulatingOrNot){
		this.title = title;
		this.author = author;
		this.libraryOfCongressCatalogNumber = libraryOfCongressCatalogNumber;
		this.publisher = publisher;
		this.year = year;
		this.circulatingOrNot = circulatingOrNot;
	}
	
public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getLibraryOfCongressCatalogNumber() {
		return libraryOfCongressCatalogNumber;
	}


	public void setLibraryOfCongressCatalogNumber(int libraryOfCongressCatalogNumber) {
		this.libraryOfCongressCatalogNumber = libraryOfCongressCatalogNumber;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public boolean isCirculatingOrNot() {
		return circulatingOrNot;
	}


	public void setCirculatingOrNot(boolean circulatingOrNot) {
		this.circulatingOrNot = circulatingOrNot;
	}


private String title;
private String author;
private int libraryOfCongressCatalogNumber;
private String publisher;
private int year;
private boolean circulatingOrNot;


	

}
