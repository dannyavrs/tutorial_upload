package com.learn.oophomework;

import java.math.BigDecimal;

public class BookService {



    public Book[]filterBooksByAuthor(Authors authors, Book[]books){

        int count=0;
        for (int i = 0; i < books.length; i++) {
            if(books[i].hasAuthor(authors)){
                count++;
            }
        }
        Book[]book_filtered=new Book[count];
        int count2=0;
        for (Book book : books) {
            if (book.hasAuthor(authors)) {
                book_filtered[count2] = book;
                count2++;
            }
        }
        return book_filtered;
    }
    public Book[]filterBooksByPublisher(Publisher publisher,Book[]books){
        int count=0;
        for(Book book: books){
            if(book.hasPublisher(publisher)){
                count++;
            }
        }
        Book[]filtered=new Book[count];
        int count2=0;
        for(Book book: books){
            if(book.hasPublisher(publisher)){
                filtered[count2]=book;
            }
        }
        return filtered;
    }


}
