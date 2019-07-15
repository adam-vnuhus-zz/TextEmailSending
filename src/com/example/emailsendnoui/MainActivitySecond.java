package com.example.emailsendnoui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivitySecond extends Activity {

	Button send_btn ;
	EditText mail_id_text ;
	String mail ;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        
        send_btn = (Button) findViewById(R.id.button1_send);
        mail_id_text = (EditText) findViewById(R.id.editText1_mailId);
        
        Log.v("hari","edittext text"+mail_id_text.getText());
        
        send_btn.setOnClickListener(new OnClickListener() {
			
			@SuppressLint("ShowToast")
			@Override
			public void onClick(View v) {

				if(mail_id_text != null) {
				
				StringBuilder str_mail = new StringBuilder() ;
				str_mail.append(mail_id_text.getText());
				mail = str_mail.toString();
				Log.v("hari", "mail:"+mail);
				
				/*StringBuilder str = new StringBuilder() ;
				str.append("ErrorName:").append("MalformedURLException :--");
				str.append("e.getClass").append("--").append("e.getMessage");*/
				String s = "mynewpassword" ;
				Log.v("hari", "Response Before:"+s);
				emailsend(s);
				} else {
					Toast.makeText(getApplicationContext(), "Pls enter mail id", 5).show();
				}
			}
		});
        
	}
	
	private void emailsend(String serverresponse) {

		
		try {   
	        GMailSender sender = new GMailSender("mail_id_name@gmail.com", "password"); //  type ur mail id and password here and next line also
	        sender.sendMail("Subject : This is Hari Testing ","Body: ServerRespHere: GET new password from DB here:"+serverresponse,"mail_id_name@gmail.com",mail);
	        Toast.makeText(getApplicationContext(), "Email Send Successfully...", 5).show();
	    } catch (Exception e) {   
	        Log.v("hari","send email"+ e.getMessage(), e);   
	    } 
	      
		}
}
