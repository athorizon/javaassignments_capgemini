package lab2;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Book object=new Book("book1", "book of java", 10, "Kunal");
        object.printDetails();
        
        CD object1=new CD("CD1", "CD of java", 10, 3, "educational");
        object1.printDetails();
        
        JournelPaper object2=new JournelPaper("journel1", "journel of java", 10, "Kunal", 2019);
        object2.printDetails();
        
        Video object3=new Video("Video1", "Video on java", 10, 5, "Kunal", "educational", 2020);
        object3.printDetails();
	}

}
