package ml.neophyte.khoon.khoon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void donateBlood(View view)
    {
        Intent intent = new Intent(getApplicationContext(),signup.class);
        startActivity(intent);
    }

    public void searchBlood(View view){
        Intent intent = new Intent(getApplicationContext(),search.class);
        startActivity(intent);
    }
}
