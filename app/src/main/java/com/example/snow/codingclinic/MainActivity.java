package com.example.snow.codingclinic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);

        final String app_name = this.getString(R.string.app_name);
        final String userName = this.getString(R.string.userName);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                final TextView mTextView = (TextView)findViewById(R.id.text);
                if(mTextView.getText() == app_name)
                {
                    mTextView.setText(userName);
                }
                else
                {
                    mTextView.setText(app_name);
                }

            }
        });
    }
}
