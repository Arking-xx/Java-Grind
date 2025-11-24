import java.util.Objects;

public class HashLibaryPractice {
    public static void main (String[] args){

        Books book1 = new Books("Arking", "Gooning");
        Books book2 = new Books("Arking", "Gooning");
        Books book3 = new Books("riri", "Gooning");


        System.out.println(book2.equals(book1));
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));

    }
    static class Books {
        String author;
        String title;

        Books(String author, String title){
            this.author = author;
            this.title = title;
        }
        @Override
        public boolean equals(Object o){
            if(this == o) return true;
            if(o == null || getClass() != o.getClass()) return false;
            Books books = (Books) o;
        return Objects.equals(author, books.author) && Objects.equals(title, books.title);        }
        @Override
        public int hashCode(){
            return Objects.hash(author, title);
        }
    }
}
