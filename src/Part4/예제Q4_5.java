package Part4;

class Book {
    String title;
    String author;

    Book() {
        this("", ""); //매개변수 2개인 생성자 호출
        System.out.println("생성자 호출됨");
    }

    Book(String title) {
        this(title, "작자미상"); //매개변수 2개인 생성자 호출
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void show() {
        System.out.println(title + " " + author);
    }
}

public class 예제Q4_5 {
    public static void main(String[] args) {
        Book littlePrince = new Book("자바 Programming", "김희범"); //매개변수 2개인 생성자 호출
        Book loveStory = new Book("자바"); //매개변수 1개인 생성자 호출
        Book emptyBook = new Book(); //디폴트 생성자 호출
        loveStory.show();
        littlePrince.show();
    }
}
