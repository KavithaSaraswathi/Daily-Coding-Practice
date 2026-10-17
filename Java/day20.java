//Library Book Management
class Book{
    String title;
    String author;
    boolean isAvailable;
    Book(String title,String author){
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }
    void borrowBook(){
        if(isAvailable){
            System.out.println("Book is available");
            isAvailable=false;
        }
        else{
            System.out.println("Book is not available");
        }
    }
    void returnBook(){
        if(!isAvailable){
            System.out.println("Book is returned");
            isAvailable=true;
        }
        else{
            System.out.println("Book is not borrowed");
        }
    }
}
public class day20{
    public static void main(String[] args){
        Book bk=new Book("HarryPotter","JK Rowling");
        bk.borrowBook();
        bk.returnBook();
    }
}