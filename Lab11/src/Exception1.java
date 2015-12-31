


public class Exception1 {
	
	public static class LibraryRecord {
		private String title;
		private int libraryOfCongressCatalogNumber;
		private String author;
		private String publisher;
		private int year;
		private boolean circulatingOrNot;

		public LibraryRecord (String title, String author, int libraryOfCongressCatalogNumber, String publisher, int year , boolean circulatingOrNot){
			this.title = title;
			this.author = author;
			this.libraryOfCongressCatalogNumber = libraryOfCongressCatalogNumber;
			this.publisher = publisher;
			this.year = year;
			this.circulatingOrNot = circulatingOrNot;
		}
		
	public static void main (String[]args){
		LibraryRecord Record1 =  new LibraryRecord (null, "john", 12345, "GW", 2014 , true);
		Record1.title.charAt(50); 
		
		 
		 
	}
}
}
