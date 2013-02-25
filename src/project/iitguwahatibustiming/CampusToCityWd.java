package project.iitguwahatibustiming;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class CampusToCityWd extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_campus_to_city_wd);
		TextView display;
		display=(TextView)findViewById(R.id.txtDisplay);
		
		Calendar rightNow = Calendar.getInstance();
	 	   int hour = rightNow.get(Calendar.HOUR_OF_DAY);
	 	   int minute = rightNow.get(Calendar.MINUTE);
	 	   int weekday = rightNow.get(Calendar.DAY_OF_WEEK);
	 	   float timenow=(float) ((float)hour+((float)minute*0.01));
	 	   
	 	  if(timenow<8.00){
	 	 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 8:00AM, 9:00AM and 10:00AM");
	 	   }
	 	   else if(timenow>8.00 && timenow <9.00){
	 		   if(weekday==5){
	 			   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 9:00AM, 10:00AM and 11:00AM");
	 		   }
	 		   else{
	 	 	 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 9:00AM, 10:00AM and 12:00Noon");
	 		   }
	 	   }
	 	   else if(timenow>9.00 && timenow <10.00){
	 		   if(weekday==5){
	 			   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 10:00AM, 11:00AM and 12:00Noon");
	 		   }
	 		   else{
	 			   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 10:00AM, 12:00Noon and 1:00PM");
	 		   }
		   }
	 	   else if(timenow>10.00  && timenow <11.00){
	 		   if(weekday==5){
	 			   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 11:00AM, 12:00Noon and 1:00PM");
	 		   }
	 		   else{
	 			   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 12:00Noon, 1:00PM and 2:00PM");
	 		   }
	 	   }
	 	   else if(timenow>11.00 && timenow <12.00){
			 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 12Noon, 1:00PM and 2:00PM");
	 	   }
	 	   else if(timenow>12.00 && timenow <13.00){
		 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 1:00PM, 2:00PM and 3:00PM");
		   }
	 	  else if(timenow>13.00 && timenow <14.00){
		 	   display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 2:00PM, 3:00PM and 4:00PM");
		   }
	 	  else if(timenow>14.00 && timenow <15.00){
	 		  if(weekday==5){
	 			  display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 3:00PM, 5:00PM and 5:15PM");
	 		  }
	 		  else{
	 			  display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 3:00PM, 5:00PM and 5:40PM (4 buses)");
	 		  }
		   }
	 	  else if(timenow>15.00 && timenow <17.00){
	 		 if(weekday==5){
	 			  display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 5:00PM, 5:15PM and 5:40PM (4 buses)");
	 		  }
	 		  else{
	 			  display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 5:00PM, 5:40PM (4 buses) and 6:45PM");
	 		  }
		   }
	 	  
	 	 else if(timenow>17.00 && timenow <17.15){
	 		 if(weekday==5){
	 			  display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 5:15PM, 5:40PM (4 buses)  and 6:45PM");
	 		  }
	 		  else{
	 			  display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 5:40PM (4 buses), 6:45PM and 8:00PM");
	 		  }
		   }
	 	  
	 	else if(timenow>17.15 && timenow <17.40){	 		 
	 			  display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 5:40PM (4 buses), 6:45PM and 8:00PM");
	 	  }
	 	  
	 	else if(timenow>17.40 && timenow <18.45){	 		 
			  display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 6:45PM, 8:00PM and 8:40PM");
	 	}
	 	   
	 	else if(timenow>18.45 && timenow <20.00){	 		 
			  display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 8:00PM, 8:40PM and 9:00PM");
	 	}
	 	  
	 	else if(timenow>20.00 && timenow <20.40){	 		 
			  display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 8:40PM, 9:00PM and 9:15PM");
	 	}
	 	  
	 	else if(timenow>20.40 && timenow <21.00){	 		 
			  display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 9:00PM, 9:15PM and 9:30PM");
	 	}
	 	  
	 	else if(timenow>21.00 && timenow <21.15){	 		 
			  display.setText("Time is "+hour+":"+minute+  "\n Next 3 buses are at 9:00PM, 9:15PM and 9:30PM");
	 	}
	 	  
	 	else if(timenow>21.15 && timenow <21.30){	 		 
			  display.setText("Time is "+hour+":"+minute+  "\n Next 2 buses are at 9:30PM and 9:35PM (Last Bus)");
	 	}
	 	else if(timenow>21.30 && timenow < 21.35){
		 	   display.setText("\n Next bus is at 9:35PM (Last Bus)");
		  }
	 	   
	 	   else if(timenow>21.35){
		 	   display.setText("There is no more bus until tomorrow at 6:45AM");
		   }
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_campus_to_city_wd, menu);
		return true;
	}

}
