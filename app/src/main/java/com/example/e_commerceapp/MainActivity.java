package com.example.e_commerceapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.e_commerceapp.model.Product;
import com.example.e_commerceapp.model.ProductResponse;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvProduct;
    List<Product> productArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvProduct = findViewById(R.id.recyclerView);
        rvProduct.setHasFixedSize(true);
        productArrayList = ProductResponse.getInstance().getList();
        rvProduct.setLayoutManager(new GridLayoutManager(this, 2));
        rvProduct.setAdapter(new ProductAdapter(MainActivity.this, productArrayList));
    }
}