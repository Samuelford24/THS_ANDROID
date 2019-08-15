package com.samuelford48gmail.thssouth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by samuelford on 5/24/18.
 */

public class Sports extends AppCompatActivity implements View.OnClickListener {
    private ImageButton one, two, three, four, five, six, seven, eight;
    private String sport;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sports);
        one = (ImageButton) findViewById(R.id.left_r1);
        two = (ImageButton) findViewById(R.id.left_r2);
        three = (ImageButton) findViewById(R.id.left_r3);
        four = (ImageButton) findViewById(R.id.right_r1);
        five = (ImageButton) findViewById(R.id.right_r2);
        six = (ImageButton) findViewById(R.id.right_r3);
        seven = (ImageButton) findViewById(R.id.football);
        eight = (ImageButton) findViewById(R.id.volleyball);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.left_r1:
                i = new Intent(Sports.this, Girls_tennis.class);
                sport = "Boys_cross-country";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.left_r2:
                i = new Intent(Sports.this, Girls_tennis.class);
                sport = "Boys_soccer";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.left_r3:
                i = new Intent(Sports.this, Girls_tennis.class);
                sport = "Boys_tennis";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.right_r1:
                i = new Intent(Sports.this, Girls_tennis.class);
                sport = "Girls_cross-country";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.right_r2:
                i = new Intent(Sports.this, Girls_tennis.class);
                sport = "Girls_soccer";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.right_r3:
                i = new Intent(Sports.this, Girls_tennis.class);
                sport = "Girls_golf";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.football:
                i = new Intent(Sports.this, Girls_tennis.class);
                sport = "Football";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            case R.id.volleyball:
                i = new Intent(Sports.this, Girls_tennis.class);
                sport = "Girls_volleyball";
                i.putExtra("sport", sport);
                startActivity(i);
                break;
            default:
                break;
        }
    }

}
  /*  public void open1(View view){
        Intent intent = new Intent(Sports.this, Boys_basketball.class);
        startActivity(intent);
    }
    public void open2(View view){
        Intent intent = new Intent(Sports.this, Girls_basketball.class);
        startActivity(intent);
    }
    public void open3(View view){
        Intent intent = new Intent(Sports.this, Boys_swimming.class);
        startActivity(intent);
    }
    public void open4(View view){
        Intent intent = new Intent(Sports.this, Girls_swimming.class);
        startActivity(intent);
    }
    public void open5(View view){
        Intent intent = new Intent(Sports.this, Wrestling.class);
        startActivity(intent);
    }

    public void open_golf(View view) {
       Intent intent = new Intent(Sports.this, Golf.class);
        startActivity(intent);
    }

    public void open_football(View view) {
    Intent intent = new Intent(Sports.this, Football.class);
     startActivity(intent);
     }

    public void open_boys_soccer(View view) {
        Intent intent = new Intent(Sports.this, Boys_soccer.class);
        startActivity(intent);
    }

     public void open_girls_soccer(View view) {
      Intent intent = new Intent(Sports.this, Girls_soccer.class);
       startActivity(intent);
     }

    public void open_girls_tennis(View view) {
       Intent intent = new Intent(Sports.this, Boys_tennis.class);
       startActivity(intent);
    }

    public void open_volley_ball(View view) {
        Intent intent = new Intent(Sports.this, Volley_ball.class);
        startActivity(intent);

    }
    public void open_boys_cross_country(View view) {
        Intent intent = new Intent(Sports.this, Boys_cross_country.class);
        startActivity(intent);

    }
    public void open_girls_cross_country(View view) {
        Intent intent = new Intent(Sports.this, Girls_cross_country.class);
        startActivity(intent);

    }
}
*/
