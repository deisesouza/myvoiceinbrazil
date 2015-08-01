package com.deisesouza.myvoiceinbrazil;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Mobility extends ActionBarActivity {

    MediaPlayer mp = new MediaPlayer();
    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobility);

        voltar = (Button)findViewById(R.id.btnVoltar);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent voltar = new Intent(Mobility.this, MainActivity.class);
                Mobility.this.startActivity(voltar);
                Mobility.this.finish();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mobility, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //chamada do método do botao Taxi
    public void BotaoTaxi(View view) {
        try {
            mp.stop();
            mp = MediaPlayer.create(this, R.raw.teste_taxi);
            mp.start();
            mp.setLooping(false);
        }finally{}

    }//fim do método do botao Taxi

    //chamada do método do botao STOP
    public void BotaoParar(View view) {
        try {
            mp.stop();
        }finally{}

    }//fim do método do botao stop


}
