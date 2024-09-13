package se.amanda.talkingtopics;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.TopicViewHolder> {

    private List<Topic> topicList;

    public TopicAdapter(List<Topic> topicList) {
        this.topicList = topicList;
    }

    @Override
    @NonNull
    public TopicViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.topic_cards, parent, false);
        return new TopicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TopicViewHolder holder, int position) {
    Topic topic = topicList.get(position);
    holder.topicTitle.setText(topic.getTitle());
    holder.topicInfo.setText(topic.getInfo());
    holder.topicImage.setImageResource(topic.getImageResId());
    }

    @Override
    public int getItemCount() {
        return topicList.size();
    }

    public static class TopicViewHolder extends RecyclerView.ViewHolder {
        ImageView topicImage;
        TextView topicTitle;
        TextView topicInfo;

        public TopicViewHolder (View itemView) {
            super(itemView);
            topicImage = itemView.findViewById(R.id.topicImage);
            topicTitle = itemView.findViewById(R.id.topicTitle);
            topicInfo = itemView.findViewById(R.id.topicInfo);
        }
    }
}