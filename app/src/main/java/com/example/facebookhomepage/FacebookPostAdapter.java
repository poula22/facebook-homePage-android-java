package com.example.facebookhomepage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FacebookPostAdapter extends RecyclerView.Adapter<FacebookPostAdapter.FacebookPostHolder> {
    List<FacebookPostItems> posts;

    public FacebookPostAdapter(List<FacebookPostItems> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public FacebookPostHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.facebook_post,parent,false);
        FacebookPostHolder postHolder=new FacebookPostHolder(view);
        return postHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FacebookPostHolder holder, int position) {
        FacebookPostItems items= posts.get(position);
        holder.profileIcon.setImageResource(items.getProfileIconId());
        holder.profileName.setText(items.getProfileName());
        holder.profileTime.setText(items.getProfileTime());
        holder.postText.setText(items.getPostText());
        holder.postImage.setImageResource(items.getPostIamgeId());
        holder.reactionCount.setText(items.getPostReactionCount());
        holder.reactionCount.setCompoundDrawablesRelativeWithIntrinsicBounds(items.getPostReactionIcon(),0,0,0);
        holder.reactionButton.setText(items.getReactionButtonText());
        holder.reactionButton.setCompoundDrawablesRelativeWithIntrinsicBounds(items.getReactionButtonIcon(),0,0,0);
        holder.commentButton.setText(items.getCommentButtonText());
        holder.commentButton.setCompoundDrawablesRelativeWithIntrinsicBounds(items.getCommentButtonIcon(),0,0,0);
        holder.shareButton.setText(items.getShareButtonText());

        holder.shareButton.setCompoundDrawablesRelativeWithIntrinsicBounds(items.getShareButtonIcon(),0,0,0);

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class FacebookPostHolder extends RecyclerView.ViewHolder{
        ImageView profileIcon,postImage;
        TextView profileName,profileTime,reactionCount,postText;
        Button reactionButton,commentButton,shareButton;
        public FacebookPostHolder(View itemView){
            super(itemView);
            profileIcon=itemView.findViewById(R.id.post_profile_icon);
            postImage=itemView.findViewById(R.id.post_img);
            profileName=itemView.findViewById(R.id.post_profile_name);
            profileTime=itemView.findViewById(R.id.post_profile_time);
            reactionCount=itemView.findViewById(R.id.post_reaction_count);
            postText=itemView.findViewById(R.id.post_text);
            reactionButton=itemView.findViewById(R.id.post_reaction_button);
            commentButton=itemView.findViewById(R.id.post_comment_button);
            shareButton=itemView.findViewById(R.id.post_share_button);
        }
    }

}
