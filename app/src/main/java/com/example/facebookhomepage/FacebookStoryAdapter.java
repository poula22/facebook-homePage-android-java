package com.example.facebookhomepage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FacebookStoryAdapter extends RecyclerView.Adapter<FacebookStoryAdapter.FaceBookStoryHolder> {
    List<FacebookStoryData> stories;

    public FacebookStoryAdapter(List<FacebookStoryData> stories) {
        this.stories = stories;
    }

    @NonNull
    @Override
    public FaceBookStoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.facebook_story,parent,false);
        return new FaceBookStoryHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FaceBookStoryHolder holder, int position) {
        FacebookStoryData story=stories.get(position);
        holder.storyIamge.setImageResource(story.imageId);
        holder.profileName.setText(story.profileName);
    }

    @Override
    public int getItemCount() {
        return stories.size();
    }

    public class FaceBookStoryHolder extends RecyclerView.ViewHolder{
        ImageView storyIamge;
        TextView profileName;
        public FaceBookStoryHolder(@NonNull View itemView) {
            super(itemView);
            storyIamge=itemView.findViewById(R.id.story_image);
            profileName=itemView.findViewById(R.id.story_profile_name);
        }
    }

}
