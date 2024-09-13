package se.amanda.talkingtopics;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Set up GridLayoutManager with 2 columns
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        // Create sample podcast data
        List<Topic> podcastList = new ArrayList<>();
        podcastList.add(new Topic("Glass", "Gott", R.drawable.glass));
        podcastList.add(new Topic("Mat", "Mumms", R.drawable.mat));
        // Add more podcasts as needed

        // Set up the adapter
        TopicAdapter adapter = new TopicAdapter(podcastList);
        recyclerView.setAdapter(adapter);
    }
}
