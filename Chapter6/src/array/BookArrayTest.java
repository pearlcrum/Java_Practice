package array;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		library[0]= new Book("�¹���0","������");
		library[1]= new Book("�¹���1","������");
		library[2]= new Book("�¹���2","������");
		library[3]= new Book("�¹���3","������");
		library[4]= new Book("�¹���4","������");
		
		for(int i=0; i< library.length;i++)
		{
			System.out.print(library[i]+" ");
			library[i].showBookInfo();
		}
	}

}
