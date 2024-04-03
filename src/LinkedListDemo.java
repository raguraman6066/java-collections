import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    //uses doubly linked list
    //insert and remove is easy without reallocation
    //single linked list-linked list contains node which contains data and pointer, start with head

    public static void main(String[] args) {
        List<Book> bookList=new LinkedList<>();
        Book b1=new Book(1,"Book1","Me","Me",800);
        Book b2=new Book(2,"Book2","Me","Me",300);
        Book b3=new Book(3,"Book3","Me","Me",100);
        Book b4=new Book(4,"Book4","Me","Me",50);

bookList.add(b1);
bookList.add(b2);
bookList.add(b3);
bookList.add(b4);

        Iterator<Book> iterator=bookList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}

class Book{
    int id;
    String name,author,publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{"+
                "id="+id+
                ", name='"+name+'\''
                +", author="+author+'}';
    }
}
