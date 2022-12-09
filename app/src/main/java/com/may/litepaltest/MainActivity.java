package com.may.litepaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import org.litepal.LitePal;
import org.litepal.exceptions.DataSupportException;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAdd = findViewById(R.id.btn_add);
        Button btnQuery = findViewById(R.id.btn_query);
        LitePal.getDatabase();
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Book book=new Book();
                book.setName("活着");
                book.setAuthor("余华");
                book.setPages(234);
                book.setPrice(32);
                book.save();
            }
        });
        btnQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Book> books = LitePal.findAll(Book.class);
                for (Book book : books) {
                    Log.d("MainActivity", "book name is: "+book.getName());
                    Log.d("MainActivity", "book author is: "+book.getAuthor());
                    Log.d("MainActivity", "book pages is: "+book.getPages());
                    Log.d("MainActivity", "book price is: "+book.getPrice());
                }
            }
        });
    }
}