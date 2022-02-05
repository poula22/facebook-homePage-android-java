package com.example.facebookhomepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView postsRecyclerView;
    List<FacebookPostItems> posts;
    RecyclerView storiesRecyclerView;
    List<FacebookStoryData> stories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
        storiesRecyclerView=findViewById(R.id.stories);
        LinearLayoutManager l=new LinearLayoutManager(this);
        l.setOrientation(RecyclerView.HORIZONTAL);
        storiesRecyclerView.setLayoutManager(l);
        storiesRecyclerView.setAdapter(new FacebookStoryAdapter(stories));
        postsRecyclerView =findViewById(R.id.posts);
        postsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        postsRecyclerView.setAdapter(new FacebookPostAdapter(posts));

    }
    public void test(){
        posts =new ArrayList();
        stories=new ArrayList();
        for (int i=0;i<10;i++){
            FacebookPostItems post=new FacebookPostItems(R.drawable.profile_icon,R.drawable.route,"name "+i,
                    "time "+i,"postText "+i,""+i,R.drawable.reaction_icon,
                    "like","comment","share",R.drawable.reaction_icon,
                    R.drawable.comment_icon,R.drawable.share_icon);
            posts.add(post);
            stories.add(new FacebookStoryData(R.drawable.route,"name "+i));
            post=new FacebookPostItems(R.drawable.profile_icon,R.drawable.android,"name "+i,
                    "time "+i,"postText "+i,""+i,R.drawable.reaction_icon,
                    "like","comment","share",R.drawable.reaction_icon,
                    R.drawable.comment_icon,R.drawable.share_icon);
            posts.add(post);
            stories.add(new FacebookStoryData(R.drawable.android,"name "+i));
            post=new FacebookPostItems(R.drawable.profile_icon,R.drawable.ios,"name "+i,
                    "time "+i,"postText "+i,""+i,R.drawable.reaction_icon,
                    "like","comment","share",R.drawable.reaction_icon,
                    R.drawable.comment_icon,R.drawable.share_icon);
            posts.add(post);
            post=new FacebookPostItems(R.drawable.profile_icon,R.drawable.fullstack,"name "+i,
                    "time "+i,"postText "+i,""+i,R.drawable.reaction_icon,
                    "like","comment","share",R.drawable.reaction_icon,
                    R.drawable.comment_icon,R.drawable.share_icon);
            posts.add(post);
            stories.add(new FacebookStoryData(R.drawable.fullstack,"name "+i));
        }
    }
}