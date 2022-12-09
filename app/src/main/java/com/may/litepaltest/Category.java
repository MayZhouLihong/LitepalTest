package com.may.litepaltest;

import org.litepal.LitePal;
import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

/**
 * DES:
 * <p>
 * Date: 2022/12/9  22:04
 *
 * @author Jason
 */
public class Category extends LitePalSupport {
    @Column(unique = true, defaultValue = "unknown")
    private String name;
    @Column(index = true)
    private int pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
