package com.practice.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.practice.bt6.R;

import java.util.List;

public class SubjectAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Subject> subjectList;
    private class ViewHolder{
        TextView txtName, txtDesc;
        ImageView imvPicture;
    }

    public SubjectAdapter(Context context, int layout, List<Subject> subjectList) {
        this.context = context;
        this.layout = layout;
        this.subjectList = subjectList;
    }

    public SubjectAdapter() {
    }

    public Context getContext() {
        return context;
    }

    public int getLayout() {
        return layout;
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    @Override
    public int getCount() {
        return subjectList.size();
    }

    @Override
    public Object getItem(int i) {
        return subjectList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = new ViewHolder();
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            viewHolder.txtName = (TextView) view.findViewById(R.id.textview_subject_name);
            viewHolder.txtDesc = (TextView) view.findViewById(R.id.textview_subject_desc);
            viewHolder.imvPicture = (ImageView) view.findViewById(R.id.imageview_subject_picture);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        Subject subject = subjectList.get(i);
        viewHolder.txtName.setText(subject.getName());
        viewHolder.txtDesc.setText(subject.getDesc());
        viewHolder.imvPicture.setImageResource(subject.getPicture());
        return view;
    }
}
