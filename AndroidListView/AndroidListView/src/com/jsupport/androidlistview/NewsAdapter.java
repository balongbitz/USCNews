package com.jsupport.androidlistview;

import java.util.ArrayList;


import android.app.Fragment;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsAdapter extends ArrayAdapter<News> {

	private final Context context;
	private final ArrayList<News> news;
	//private final Fragment fragment;
	TextView name, description;
	ImageView image;

	public NewsAdapter(Context dateFragment, int textViewResourceId, ArrayList<News> news) {
		super(dateFragment, textViewResourceId, news);
		this.context = dateFragment;
		this.news = news;
	}
	


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View rowView = convertView;
		
		if (rowView == null) {
			
			LayoutInflater inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			
			rowView = inflater.inflate(R.layout.row_layout, parent, false);
			
		} 
	
		name = (TextView) rowView.findViewById(R.id.name);		
		description = (TextView) rowView.findViewById(R.id.description);
		image = (ImageView) rowView.findViewById(R.id.image);
		 
		News p = news.get(position);
			

		name.setText(p.getName());
		description.setText(p.getItemDescription());
		image.setImageResource(p.getImageNumber());
		
		return rowView;
		
	}
	
	
}
