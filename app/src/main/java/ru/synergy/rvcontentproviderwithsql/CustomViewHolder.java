package ru.synergy.rvcontentproviderwithsql;

import android.database.Cursor;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    public TextView textView1;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        textView1 = (TextView) itemView.findViewById(android.R.id.text1);
    }

    public void setData(Cursor c){
        textView1.setText(c.getString(c.getColumnIndex("text")));
    }


}
