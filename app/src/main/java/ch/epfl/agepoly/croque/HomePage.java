package ch.epfl.agepoly.croque;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import java.util.Calendar;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Calendar calendar = Calendar.getInstance();
        int currentHour = calendar.get(Calendar.HOUR_OF_DAY);
        /*if(currentHour < 8 || currentHour >= 14) {
            setContentView(R.layout.closed_lunch_layout);
        }else {
            setContentView(R.layout.activity_home_page);
        }*/
        setContentView(R.layout.activity_home_page);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        //myToolbar.setTitle(R.string.croque_all_caps);
        myToolbar.setTitleTextColor(Color.parseColor("#BF3048"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options, menu);
        return true;
    }

    public void goToTodayQuestion(View view) {
        Intent intent = new Intent(this, QuestionsActivity.class);
        startActivity(intent);
    }
}
