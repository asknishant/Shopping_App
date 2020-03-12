package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Laptops extends AppCompatActivity {

    private RecyclerView mRecylerView;
    private RecyclerView.Adapter mAdapter;
    private  RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptops);

        ArrayList<LaptopsRecyclerView> laptoplist = new ArrayList<>();
        laptoplist.add(new LaptopsRecyclerView(R.mipmap.acer,"Acer Aspire 8th Gen/1TB HDD/Windows 10 45rtxjh Laptop","Add to Cart","4.3 (218)","$700"));
        laptoplist.add(new LaptopsRecyclerView(R.mipmap.asusvicobook,"Asus Vivobook 8th Gen/1TB HDD/Windows 10 487wvxjh Laptop","Add to Cart" ,"4.3 (218)","$750"));
        laptoplist.add(new LaptopsRecyclerView(R.mipmap.hpchromebok,"HP ChromeBook 8th Gen/1TB HDD/Windows 10 rtfghf5h Laptop",   "Add to Cart","4.3 (218)","$984"));
        laptoplist.add(new LaptopsRecyclerView(R.mipmap.microsoftsurfacepro,"Microsoft Surface Pro 8th Gen/1TB HDD/Windows 10 ghj6786 Laptop","Add to Cart","4.3 (218)","$1017"));
        laptoplist.add(new LaptopsRecyclerView(R.mipmap.lenovothinkpad,"Lenovo Thinkpad 8th Gen/1TB HDD/Windows 10 dfghdf64 Laptop","Add to Cart","4.3 (218)","$786"));

        mRecylerView=findViewById(R.id.recyclerLaptops);
        layoutManager=new LinearLayoutManager((this));
        mAdapter = new LaptopsRecyclerViewAdapter(laptoplist);
        mRecylerView.setLayoutManager(layoutManager);
        mRecylerView.setAdapter(mAdapter);


    }
}
