package project.iitguwahatibustiming;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get current date time with Date()
        Button bt_cicawd=(Button)findViewById(R.id.btCiCaWe);
        bt_cicawd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myIntent=new Intent(v.getContext(),CityToCampusWd.class);
				startActivity(myIntent);
			}
		});
        
        Button bt_caciwd=(Button)findViewById(R.id.btCaCiWe);
        bt_caciwd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v2) {
				// TODO Auto-generated method stub
				Intent myIntent=new Intent(v2.getContext(),CampusToCityWd.class);
				startActivity(myIntent);
			}
		});
        
        Button bt_caciho=(Button)findViewById(R.id.btCaCiHo);
        bt_caciho.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v3) {
				// TODO Auto-generated method stub
				Intent myIntent=new Intent(v3.getContext(),CampusToCityHo.class);
				startActivity(myIntent);
			}
		});
 	   
        Button bt_cicaho=(Button)findViewById(R.id.btCiCaHo);
        bt_cicaho.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v4) {
				// TODO Auto-generated method stub
				Intent myIntent=new Intent(v4.getContext(),CityToCampusHo.class);
				startActivity(myIntent);
			}
		});
 		   
 	   
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
