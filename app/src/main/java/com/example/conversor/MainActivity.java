package com.example.conversor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    PrimerFragmento primerFragmento = new PrimerFragmento();
    SegundoFragmento segundoFragmento = new SegundoFragmento();
    TercerFragmento tercerFragmento = new TercerFragmento();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navegacion = findViewById(R.id.navegacion);
        navegacion.setOnNavigationItemSelectedListener(mOnNavigationSelectedListener);
    }

    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int itemId = item.getItemId();

            if (itemId == R.id.primerFragmento){
                loadFragment(primerFragmento);
                return true;
            } else if (itemId == R.id.segundoFragmento) {
                loadFragment(segundoFragmento);
                return true;
            } else if (itemId == R.id.tercerFragmento) {
                loadFragment(tercerFragmento);
                return true;
            }
            return false;
        }
    };



    public void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.contenedorFrame, fragment);
        transaction.commit();
    }
}