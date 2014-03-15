package com.jsupport.androidlistview;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class SvdPage extends ListActivity {
	ListView list;
	NewsAdapter listAdapter;
	private ArrayList<News> meme = new ArrayList<News>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.svd);
		addnews();
		
		listAdapter = new NewsAdapter(this, R.layout.row_layout, meme );
		setListAdapter(listAdapter);

		list = (ListView) findViewById(android.R.id.list);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.svd_page, menu);
		return true;
	}
	public void clickpicture(View view){
		Intent intent = new Intent(this, ArticlePage.class);
        startActivity(intent);   
	}
	public void home(View view){
		Intent intent=new Intent(this, MainActivity.class);
		startActivity(intent);
	}

	
	
	public void search(View view){
		Intent intent=new Intent(this, Search.class);
		startActivity(intent);
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		News news=(News)listAdapter.getItem(position);
		Intent intent = new Intent(SvdPage.this, DetailActivity.class);
		
		intent.putExtra("image", news.getImageNumber());
		intent.putExtra("name", news.getName());
		intent.putExtra("description", news.getItemDescription());
		
		startActivity(intent);	
	}

	private void addnews(){

		meme.add(new News(
				R.drawable.svd1,
				"Condescending Wonka",
				"That's just what it's called. You don't really blow on it."));
		meme.add(new News(
				R.drawable.svd2,
				"First World Problems II",
				"Chips ran out before chips"));
		meme.add(new News(
				R.drawable.svd3,
				"Obama",
				"Swears oath to uphold constitution. Shits on constitution."));
	}
}
