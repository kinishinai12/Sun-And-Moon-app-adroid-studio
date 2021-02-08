package com.example.ilovejava;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnI;
    private Button btnLove;
    private Button btnYou;
    private Button btnHeart;
    private TextView textDialogOfTheSun;
    private ImageView imageSun;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnI:
                textDialogOfTheSun.setText(getString(R.string.sunBtn1));
                btnI.setText(getString(R.string.btn1));
                btnI.setVisibility(View.INVISIBLE);
                btnLove.setVisibility(View.VISIBLE);
                break;
            case R.id.btnLove:
                textDialogOfTheSun.setText(getString(R.string.sunBtn2));
                btnLove.setText(getString(R.string.btn2));
                btnLove.setVisibility(View.INVISIBLE);
                btnYou.setVisibility(View.VISIBLE);
                break;
            case R.id.btnYou:
                textDialogOfTheSun.setText(getString(R.string.sunBtn3));
                btnYou.setText(getText(R.string.btn3));
                btnYou.setVisibility(View.INVISIBLE);
                btnHeart.setVisibility(View.VISIBLE);
                break;
            case R.id.btnHeart:
                textDialogOfTheSun.setText(getText(R.string.sunBtn4));
                btnHeart.setBackground(getDrawable(R.drawable.ic_heart));
                btnI.setVisibility(View.VISIBLE);
                btnLove.setVisibility(View.VISIBLE);
                btnYou.setVisibility(View.VISIBLE);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnI = findViewById(R.id.btnI);
        btnLove = findViewById(R.id.btnLove);
        btnYou = findViewById(R.id.btnYou);
        btnHeart = findViewById(R.id.btnHeart);

        btnI.setOnClickListener(this);
        btnLove.setOnClickListener(this);
        btnYou.setOnClickListener(this);
        btnHeart.setOnClickListener(this);


        textDialogOfTheSun = findViewById(R.id.textSun);
        imageSun = findViewById(R.id.sunImg);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.menuSun:
                Toast.makeText(this, "under maintenance", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuMoon:
                Toast.makeText(this,"under maintenance",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuReset:
                Toast.makeText(this, "under maintenance", Toast.LENGTH_SHORT).show();
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
