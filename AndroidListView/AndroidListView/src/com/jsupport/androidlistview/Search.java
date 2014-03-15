package com.jsupport.androidlistview;

import java.util.ArrayList;


import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class Search extends ListActivity {
	ListView list;
	NewsAdapter listAdapter;
	private ArrayList<News> meme = new ArrayList<News>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search);
		
		addnews();
		
		listAdapter = new NewsAdapter(this, R.layout.row_layout, meme );
		setListAdapter(listAdapter);

		list = (ListView) findViewById(android.R.id.list);
	}

	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		News news=(News)listAdapter.getItem(position);
		Intent intent = new Intent(Search.this, DetailActivity.class);
		
		intent.putExtra("image", news.getImageNumber());
		intent.putExtra("name", news.getName());
		intent.putExtra("description", news.getItemDescription());
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search, menu);
		return true;
	}
	public void home(View view){
		Intent intent=new Intent(this, MainActivity.class);
		startActivity(intent);
	}
	private void addnews(){

		meme.add(new News(
				R.drawable.academics1,
				"Condescending Wonka",
				"That's just what it's called. You don't really blow on it."));
		meme.add(new News(
				R.drawable.extra1,
				"First World Problems II",
				"Chips ran out before chips"));
		meme.add(new News(
				R.drawable.front1,
				"Obama",
				"Swears oath to uphold constitution. Shits on constitution."));
		meme.add(new News(
				R.drawable.pics1,
				"One Doesn't Simply",
				"One doesn't simply log-out."));
		meme.add(new News(
				R.drawable.svd1,
				"So doge",
				"Wow very love such valentine"));
	}
}
