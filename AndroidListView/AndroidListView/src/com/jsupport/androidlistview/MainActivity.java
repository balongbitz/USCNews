package com.jsupport.androidlistview;

import java.util.ArrayList;
import java.util.Locale;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	

	@SuppressLint("NewApi")
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.uscnews);
	}
	
	public void clickpicture(View view){
		Intent intent = new Intent(this, ArticlePage.class);
        startActivity(intent);   
	}
	public void home(View view){
		Intent intent=new Intent(this, MainActivity.class);
		startActivity(intent);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return false; 
	}
	public void search(View view){
		Intent intent=new Intent(this, Search.class);
		startActivity(intent);
	}
	
	public void academics(View view){
		Intent intent=new Intent(this, AcademicsPage.class);
		startActivity(intent);
	}
	public void extracurricular(View view){
		Intent intent=new Intent(this, ExtraPage.class);
		startActivity(intent);
	}
	public void svd(View view){
		Intent intent=new Intent(this, SvdPage.class);
		startActivity(intent);
	}
	public void calendar(View view){
		Intent intent=new Intent(this, CalendarPage.class);
		startActivity(intent);
	}
}
