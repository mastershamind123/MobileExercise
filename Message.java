package com.example.swapperchecker;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;



public class MyMessage extends Activity {
    TextView t;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.SwapChecker2ndlayout);
        Intent secondActivity = getIntent();
        t = (TextView) findViewById(R.id.msg_text_view);
        String result = secondActivity.getStringExtra("same");
        t.setText(result);

    }
}
