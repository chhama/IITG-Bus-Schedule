package project.iitguwahatibustiming;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class CityToCampusHo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_city_to_campus_ho);
		
		TextView display;

		display=(TextView)findViewById(R.id.txtDisplay);
	 	   Calendar rightNow = Calendar.getInstance();
	 	   int hour = rightNow.get(Calendar.HOUR_OF_DAY);
	 	   int minute = rightNow.get(Calendar.MINUTE);
	 	   float timenow=(float) ((float)hour+((float)minute*0.01));
	 	  
	 	   if(timenow<6.45){
	 	 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 6:45AM, 7:45AM and 8:15AM");
	 	   }
	 	   else if(timenow>6.45 && timenow <7.45){
	 		   
	 			   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 7:45AM, 8:15AM and 10:00AM");
	 	}
	 	   else if(timenow>7.45 && timenow <8.15){
	 		   	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 8:15AM, 10:00AM and 11:00AM");
	 	 }
	 	   else if(timenow>8.15 && timenow <10.00){
	 			   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 10:00AM, 11:00AM and 1:00PM");
	 		   
	 	   }
	 	   else if(timenow>10.00 && timenow <11.00){
			 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 11:00AM, 1:00PM and 2:00PM");
	 	   }
	 	   else if(timenow>11.00 && timenow <13.00){
		 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 1:00PM, 2:00PM and 3:00PM");
		   }
	 	  else if(timenow>13.00 && timenow <14.00){
		 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 2:00PM, 3:00PM and 4:00PM");
		   }
	 	 else if(timenow>14.00 && timenow <15.00){
		 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 3:00PM, 4:00PM and 5:00PM");
		   }
	 	else if(timenow>15.00 && timenow <16.00){
		 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 4:00PM, 5:00PM and 6:00PM");
		   }
	 	else if(timenow>16.00 && timenow <17.00){
		 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 5:00PM, 6:00PM and 6:30PM");
		   }
	 	else if(timenow>17.00 && timenow <18.00){
		 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 6:00PM, 6:30PM and 7:15PM");
		   }
	 	else if(timenow>18.00 && timenow <18.30){
		 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 6:30PM, 7:15PM and 8:00PM");
		   }
	 	else if(timenow>18.30 && timenow <19.15){
		 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 7:15PM, 8:00PM and 8:30PM");
		   }
	 	else if(timenow>19.15 && timenow <20.00){
		 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 8:00PM, 8:30PM and 8:45PM");
		   }
	 	else if(timenow>20.00 && timenow <20.30){
		 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 8:30PM, 8:45PM and 8:55PM");
		   }
	 	else if(timenow>20.30 && timenow <20.45){
		 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 8:45PM, 8:55PM and 9:00PM (Last Bus)");
		   }
	 	else if(timenow>20.45 && timenow <20.55){
		 	   display.setText("Time is "+hour+":"+minute+  "\n Next 2 buses are at 8:55PM, 9:00PM (Last Bus)");
		   }
	 	   else if(timenow>20.55 && timenow <21.00){
		 	   display.setText("Time is "+hour+":"+minute+  "\n Next bus is at 9:00PM (Last Bus)");
		   }
	 	   else if(timenow>21.00){
		 	   display.setText("There is no more bus until tomorrow at 6:45AM");
		   }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_city_to_campus_ho, menu);
		return true;
	}

}
