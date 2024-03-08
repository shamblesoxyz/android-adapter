package com.practice.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.practice.bt6.R;

import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.SongViewHolder> {
    private static final String TAG = "SongAdapter";
    private List<SongModel> songModelList;
    private Context context;
    private LayoutInflater layoutInflater;
    public SongAdapter(Context context, List<SongModel> datas){
        this.context = context;
        this.songModelList = datas;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View songView = layoutInflater.inflate(R.layout.row_song, parent, false);
        return new SongViewHolder(songView);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        SongModel songModel = songModelList.get(position);
        holder.txtTitle.setText(songModel.getTitle());
        holder.txtArtist.setText(songModel.getArtist());
        holder.imvArtwork.setImageResource(songModel.getArtwork());
    }

    @Override
    public int getItemCount() {
        return songModelList.size();
    }

    public class SongViewHolder extends RecyclerView.ViewHolder{
        private TextView txtTitle, txtArtist;
        private ImageView imvArtwork;
        public SongViewHolder(@NonNull View itemView) {
            super(itemView);
            txtTitle = (TextView) itemView.findViewById(R.id.textview_song_title);
            txtArtist = (TextView) itemView.findViewById(R.id.textview_song_artist);
            imvArtwork = (ImageView) itemView.findViewById(R.id.imageview_song_artwork);
        }
    }
}
