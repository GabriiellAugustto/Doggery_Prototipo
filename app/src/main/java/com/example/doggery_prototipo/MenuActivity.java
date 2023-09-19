package com.example.doggery_prototipo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        navigationView = findViewById(R.id.bottomNavigationView);

        navigationView .setOnNavigationItemSelectedListener(this);
        navigationView.setSelectedItemId(R.id.home);
    }
     HomeFragment homeFragment= new HomeFragment();
    PedidosFragment pedidosFragment = new PedidosFragment();


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.home){
            getSupportFragmentManager().
                    beginTransaction().
                    replace(R.id.flFragment,homeFragment).commit();}

        else if (item.getItemId()==R.id.menupaw) {
            getSupportFragmentManager().
                    beginTransaction().
                    replace(R.id.flFragment,pedidosFragment).commit();

        }


        return false;
    }
}