package com.learn.oophomework;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Book {

    private int id;
    private String name;
    private Authors[]authors;
    private Publisher publisher;
    private int amountofpages;
    private BigDecimal price;
    CoverType coverType;

    public Book(int id, String name, Authors[] authors, Publisher publisher, int amountofpages, BigDecimal price, CoverType coverType) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.amountofpages = amountofpages;
        this.price = price;
        this.coverType = coverType;
    }
    public boolean hasAuthor(Authors authors2){
        for (Authors authors1: authors){
            if(authors1.equals(authors2)){
                return true;
            }
        }
        return false;
    }
    public boolean hasPublisher(Publisher publisher1){
        return publisher.equals(publisher1);

        }
    }


