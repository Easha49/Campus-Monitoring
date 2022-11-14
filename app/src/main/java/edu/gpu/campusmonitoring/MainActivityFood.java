package edu.gpu.campusmonitoring;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivityFood extends AppCompatActivity {
    MyAdapter myAdapter;
    String[] title,des;
    int[] images={
            R.drawable.c2,R.drawable.c1, R.drawable.c2,R.drawable.c2 ,R.drawable.c1 ,
            R.drawable.c2 , R.drawable.c3,R.drawable.c2};

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv);

        title=getResources().getStringArray(R.array.Canteen);

        des = getResources().getStringArray(R.array.Description);
        myAdapter = new MyAdapter(this ,title,des,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}