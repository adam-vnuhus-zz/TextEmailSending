package com.example.emailsendnoui;

import android.os.Bundle;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    Button btn ;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn = (Button) findViewById(R.id.button1_forgetpassword);
        
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Intent intent = new Intent(MainActivity.this,MainActivitySecond.class);
				startActivity(intent);
				
				/*StringBuilder str = new StringBuilder() ;
				str.append("ErrorName:").append("MalformedURLException :--");
				str.append("e.getClass").append("--").append("e.getMessage");
				String s = str.toString() ;
				Log.v("hari", "Response Before:"+s);
				emailsend(s);*/
			}
		});
        
    }

	/*private void emailsend(String serverresponse) {

	
	try {   
        GMailSender sender = new GMailSender("civilmap.test@gmail.com", "civilmap");
        sender.sendMail("Subject : This is Hari TEsting ","Body: ServerRespHere:"+serverresponse,"civilmap.test@gmail.com","vhkrishnan.v@gmail.com");   
    } catch (Exception e) {   
        Log.e("SendMail", e.getMessage(), e);   
    } 
      
	}*/
	
}
