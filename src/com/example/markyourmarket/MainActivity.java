package com.example.markyourmarket;


import android.net.ConnectivityManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemSelectedListener, OnClickListener{
	
	Spinner s1;
	EditText et;
	Button b;
	String prod, categ, link;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		et=(EditText)findViewById(R.id.editText1);
		b=(Button)findViewById(R.id.button1);
		s1=(Spinner)findViewById(R.id.spinner1);
		
		b.setOnClickListener(this);
		
		s1.setOnItemSelectedListener(this);
		
		
		
		
	ArrayAdapter<CharSequence> cat = ArrayAdapter.createFromResource(this,R.array.categories,android.R.layout.simple_spinner_dropdown_item);
	s1.setAdapter(cat);
	
	
				
	}
	

		
	
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}







	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		
		categ = s1.getSelectedItem().toString();
		prod = et.getText().toString();		
		
		
	}







	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}







	@Override
	public void onClick(View v) {
		
		if (prod.equalsIgnoreCase(""))
		{
			Toast.makeText(this,"Enter Product to Sell", Toast.LENGTH_SHORT).show();
			return;
		}
		if(categ.equalsIgnoreCase("Click To Select Category"))
		{
			Toast.makeText(this,"Select A Valid Category",Toast.LENGTH_SHORT).show();
			return;
		}
			
		String s1 = prod.replaceAll(" ","_");
		String s2 = categ.replaceAll(" ","_");
		
		link="http://www.xzhibit.com/mym/searchphone.php?product=";
		link = link.concat(s1);
		link = link.concat("&category=");
		link = link.concat(s2);
		
		
		
		Intent i1 = new Intent(MainActivity.this,Second.class); 
		
		i1.putExtra("url",link);
		startActivity(i1);
				
	}







	
}
