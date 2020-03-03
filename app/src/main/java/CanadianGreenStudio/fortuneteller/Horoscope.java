package CanadianGreenStudio.fortuneteller;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Horoscope extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horocope);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageView astroSign = findViewById(R.id.astro_sign);
        astroSign.setImageResource(R.drawable.aries);

        /*
        final String birthday = getIntent().getStringExtra("Birthday info");
        TextView birthdayDisplay = (TextView) findViewById(R.id.birthday_display);
        birthdayDisplay.setText(birthday); */


    }

}
