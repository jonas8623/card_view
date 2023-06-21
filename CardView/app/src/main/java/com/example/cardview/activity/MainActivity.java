package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostAdapter;
import com.example.cardview.model.PostModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<PostModel> postModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Define o layout
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        // Define Adapter
        this.getPosts();
        PostAdapter postAdapter = new PostAdapter(postModelList);
        recyclerView.setAdapter(postAdapter);
    }

    public void getPosts() {
        PostModel postModel = new PostModel("Douglas Luiz", "#Muito top!", R.drawable.imagem1);
        this.postModelList.add(postModel);

        postModel = new PostModel("Jair Felipe", "#Muito top!", R.drawable.imagem2);
        this.postModelList.add(postModel);

        postModel = new PostModel("Thiago Santos", "#Top demais!!!", R.drawable.imagem3);
        this.postModelList.add(postModel);

        postModel = new PostModel("Beto Carlos", "#Quero voltar logo!!!", R.drawable.imagem4);
        this.postModelList.add(postModel);
    }
}