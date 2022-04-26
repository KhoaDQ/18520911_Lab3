package com.example.a18520911_lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);

        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(new User("Khoa","Binh Dinh"));
        arrayList.add(new User("Nam","Bao Loc"));
        arrayList.add(new User("Toan","Dak Lak"));
        arrayList.add(new User("Hung","Kien Giang"));


        UsersAdapter usersAdapter = new UsersAdapter(getApplicationContext(), arrayList);
        recyclerView.setAdapter(usersAdapter);
    }
}