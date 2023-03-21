package com.agn.homework3month3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.agn.homework3month3.reciclerView.Resturant;
import com.agn.homework3month3.reciclerView.ResturentAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Resturant> list = new ArrayList<Resturant>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        ResturentAdapter adapter = new ResturentAdapter(this, list);
        recyclerView.setAdapter(adapter);
        initData();
    }

    private void initData() {
        list.add(new Resturant("Плов", "мясо, рис", "130som"));
        list.add(new Resturant("Лагман", "мясо, лапша", "160som"));
        list.add(new Resturant("Борщь", "мясо, капуста", "120som"));
        list.add(new Resturant("Мясо", "мясо, картошка", "250som"));
        list.add(new Resturant("Суп", "мясо, гречка", "80som"));
        list.add(new Resturant("Манты", "тесто, мясо , картошка", "170som"));
    }
}