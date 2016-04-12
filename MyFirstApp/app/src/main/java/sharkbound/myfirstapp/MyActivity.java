package sharkbound.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MyActivity extends AppCompatActivity {

    private static final String TAG = "sharkMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        logText("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logText("onStart");
    }

    void logText(String value){
        Log.i(TAG, value);
    }
}
