package com.may.litepaltest;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

/**
 * DES:
 * <p>
 * Date: 2022/12/9  21:38
 *
 * @author Jason
 */
public class Book extends LitePalSupport {
    @Column(unique = true, defaultValue = "unknown")
    private String name;
    @Column(unique = true, defaultValue = "unknown")
    private String author;
    @Column(index = true)
    private double price;
    private int pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
