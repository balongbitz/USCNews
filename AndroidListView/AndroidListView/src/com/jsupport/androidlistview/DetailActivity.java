package com.jsupport.androidlistview;



import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends Activity {
	Button button;
	private static final String TAG_IMAGE = "image";
	private static final String TAG_NAME = "name";
	private static final String TAG_IDEA_DESCRIPTION = "description";
	private String name, description;	
	private int image;
	
	ImageView detail_image;
	TextView detail_name,detail_description;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		
		Intent intent = getIntent();		

		image = intent.getIntExtra(TAG_IMAGE, R.drawable.front1);
        name = intent.getStringExtra(TAG_NAME);
        description = intent.getStringExtra(TAG_IDEA_DESCRIPTION);
        
        detail_image = (ImageView) findViewById(R.id.detail_image);
        detail_image.setImageResource(image);
        
        detail_name = (TextView) findViewById(R.id.detail_name);
        detail_name.setText(name);
        detail_description = (TextView) findViewById(R.id.detail_description);
        detail_description.setText(description);       
    	addListenerOnButton();
       
	}
	public void home(View view){
		Intent intent=new Intent(this, MainActivity.class);
		startActivity(intent);
	}
	public void search(View view){
		Intent intent=new Intent(this, Search.class);
		startActivity(intent);
	}
	public void addListenerOnButton() {

		final Context context = this;

		button = (Button) findViewById(R.id.button1);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent intent = new Intent(context, CommentPage.class);
                startActivity(intent);   

			}

		});

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
