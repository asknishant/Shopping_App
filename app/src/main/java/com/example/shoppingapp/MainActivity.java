package com.example.shoppingapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> mNames = new ArrayList<>();
    ArrayList<Integer> mImageUrls = new ArrayList<>();
    GridLayout gridView;
    ScrollView scrollView;
    TextView products;
    TextView text1,text2;
    ImageView image1,image2;

    ImageView image4;

    private DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        gridView=findViewById(R.id.gridlayout);
        scrollView=findViewById(R.id.scrollview);
        //products=findViewById(R.id.products);

        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        image1=findViewById(R.id.image1);
        image2=findViewById(R.id.image2);

        mImageUrls.add(R.mipmap.offers);
        mImageUrls.add(R.mipmap.mobiles);
        mImageUrls.add(R.mipmap.electronics);
        mImageUrls.add(R.mipmap.fashion);
        mImageUrls.add(R.mipmap.beauty);
        mImageUrls.add(R.mipmap.home);
        mImageUrls.add(R.mipmap.toys);



        mNames.add("Offers");
        mNames.add("Mobiles");
        mNames.add("Electronics");
        mNames.add("Fashion");
        mNames.add("Beauty");
        mNames.add("Home");
        mNames.add("Toys");

        initRecyclerView();

        image4=findViewById(R.id.image4);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Laptops.class);
                startActivity(intent);
            }

        });



    }

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else
            super.onBackPressed();
    }

    private void initRecyclerView(){

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false );
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(mNames,mImageUrls,this);
        recyclerView.setAdapter(adapter);
    }
}
