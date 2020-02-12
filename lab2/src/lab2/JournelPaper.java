package lab2;

public class JournelPaper extends WrittenItem{
	
private int year;

public JournelPaper(String uID, String title, int numberOfCopies, String author,int year) {
	super(uID, title, numberOfCopies, author);
	// TODO Auto-generated constructor stub
	this.year=year;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}
void printDetails()
{
	super.printDetails();
	System.out.println("Year: "+getYear()+" ");
	System.out.println();
}
}
