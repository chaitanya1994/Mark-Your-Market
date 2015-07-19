package com.example.markyourmarket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class First extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		Thread t1 = new Thread(){
			public void run(){
				try{
					sleep(1000);
					
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				finally{
					Intent i=new Intent(First.this,MainActivity.class);
					startActivity(i);
					finish();
				}
				}
		};
		t1.start();
	
	
	}

}
