package Part4;

import java.util.Scanner;

class Book2 {
    String title;
    String author;

    Book2(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class 예제Q4_7 {
    public static void main(String[] args) {
        Book[] book = new Book[3]; //객체 배열 선언
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < book.length; i++) {
            System.out.print("제목>> ");
            String title = scanner.nextLine();
            System.out.print("저자>> ");
            String author = scanner.nextLine();
            book[i] = new Book(title,author);
        }

        for(int i=0; i<book.length; i++){
            System.out.print("저자: "+book[i].author+", 제목: "+book[i].title);
            System.out.println();
        }
    }
}
