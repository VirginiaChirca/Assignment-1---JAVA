package library;

public class library {
    public book[] books;
    int nr;
    static final int NR_MAX = 10;
    public library(book[] books, int nr) {
        this.nr = nr;
        this.books = new book[NR_MAX];
        System.arraycopy(books, 0, this.books, 0, nr);
    }
    public void add_book(book book) {
        books[nr] = book;
        nr++;
    }
    public void delete_book(String b) {
        for (int i = 0; i < nr; i++) {
            if (books[i].getName().equals(b)) {
                books[i] = null;
                for (int j = i; j < nr - 1; j++) {
                    books[j] = books[j + 1];
                    nr--;
                }
            }
        }
    }
    public void afisare_carti() {
        for(int i = 0; i < nr; i++) {
            books[i].afisare();
        }
    }
}
