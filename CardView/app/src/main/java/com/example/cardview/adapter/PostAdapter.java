package com.example.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.model.PostModel;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder> {

    private List<PostModel> postModels;

    public PostAdapter(List<PostModel> posts) {
        this.postModels = posts;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View postItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_item, parent, false);
        return new MyViewHolder(postItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.nameTextView.setText(this.postModels.get(position).getName());
        holder.postTextView.setText(this.postModels.get(position).getPost());
        holder.imageView.setImageResource(this.postModels.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return this.postModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView nameTextView;
        private TextView postTextView;
        private ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nameTextView = itemView.findViewById(R.id.textViewName);
            postTextView = itemView.findViewById(R.id.textViewPost);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }

}
