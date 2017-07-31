package com.example.wa.date_time_picker;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    String arrayname[] = {"Set Time","Set Date"};
    CircleMenu circleMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         circleMenu = (CircleMenu)findViewById(R.id.circle_menu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"),R.drawable.add, R.drawable.remove)
                .addSubMenu(Color.parseColor("#258CFF"), R.drawable.clock)
                .addSubMenu(Color.parseColor("#ff0000"), R.drawable.calendar)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int i) {
                        Toast.makeText(MainActivity.this,"You Selected"+arrayname[i],Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
