package com.example.a.recycler6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    Adapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.recyclerview);
        int images[] = {
                R.drawable.fruit1,
                R.drawable.fruit2,
                R.drawable.fruit3,
                R.drawable.fruit4,
                R.drawable.fruit5,
                R.drawable.fruit6,
                R.drawable.fruit1,
                R.drawable.fruit2,
                R.drawable.fruit3,
                R.drawable.fruit4,
                R.drawable.fruit5,
                R.drawable.fruit6,
                R.drawable.choco
        };
        String s2[] = {"mixed", "apple", "singleapple", "promogranate", "papaya", "straberry","mixed", "apple", "singleapple", "promogranate", "papaya", "straberry","choco"};
        String s1[] = {"so sweet", "my favourite", "healty fruit", "good for health", "digestivefood", "so picy","so sweet", "my favourite", "healty fruit", "good for health", "digestivefood", "so picy","so yemmy"
        };
        ad=new Adapter(this,s1,s2,images);
        rv.setAdapter(ad);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }
}
