package com.example.slpfinal;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {
    int money = 0;
    String text = null;
    CurrencyValues test;
    /*CurrencyValues Farmval;
    CurrencyValues Minesval;
    CurrencyValues Blacksmithval;
    CurrencyValues Churchval;
    CurrencyValues Townhallval;
    CurrencyValues Barracksval;
    CurrencyValues Libraryval;*/
    Button click;
    Button upgrade;
    Button Farm;
    Button Mines;
    Button BlackSmith;
    Button Church;
    Button Townhall;
    Button Barracks;
    Button Library;
    TextView moneyset;
    Handler incrementingHandler;
    Runnable incrementingRunnable;
    /*Handler incrementingHandlerFarm;
    Runnable incrementingRunnableFarm;
    Handler incrementingHandlerMines;
    Runnable incrementingRunnableMines;
    Handler incrementingHandlerBlackSmith;
    Runnable incrementingRunnableBlackSmith;
    Handler incrementingHandlerChurch;
    Runnable incrementingRunnableChurch;
    Handler incrementingHandlerTownhall;
    Runnable incrementingRunnableTownhall;
    Handler incrementingHandlerBarracks;
    Runnable incrementingRunnableBarracks;
    Handler incrementingHandlerLibrary;
    Runnable incrementingRunnableLibrary;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test = new CurrencyValues();
       /* Farmval = new CurrencyValues();
        Minesval = new CurrencyValues();
        Blacksmithval = new CurrencyValues();
        Churchval = new CurrencyValues();
        Townhallval = new CurrencyValues();
        Barracksval = new CurrencyValues();
        Libraryval = new CurrencyValues();*/
        click = (Button) findViewById(R.id.clickid);
        Farm = (Button) findViewById(R.id.Farmid);
        Mines = (Button) findViewById(R.id.Mineid);
        BlackSmith = (Button) findViewById(R.id.Blacksmithid);
        Church = (Button) findViewById(R.id.Churchid);
        Townhall = (Button) findViewById(R.id.Townhallid);
        Barracks = (Button) findViewById(R.id.Barracksid);
        Library = (Button) findViewById(R.id.Libraryid);
        moneyset = (TextView) findViewById(R.id.moneyviewid);
        upgrade= (Button) findViewById(R.id.upgradeid);
        incrementingHandler=new Handler();
        incrementingRunnable=new Runnable() {
            @Override
            public void run() {
                test.setMoney((test.getPassiveIncrement()));
                moneyset.setText(test.getMoney()+"");
                incrementingHandler.postDelayed(incrementingRunnable,1000);

            }
        };
        incrementingHandler.post(incrementingRunnable);


        upgrade.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View upgradeid){
                int temp =(test.getPassiveIncrement());
                temp+=10;
                test.setPassiveIncrement(temp);
            }
        }));
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View clickid) {
                test.setMoney(test.getIncrement());
                moneyset.setText(test.getMoney() + "");
            }
        });
        Farm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Farmid) {
                int temp =(test.getPassiveIncrement());
                temp+=10;
                test.setPassiveIncrement(temp);
            }
        });

        Mines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Mineid) {
                int temp =(test.getPassiveIncrement());
                temp+=10;
                test.setPassiveIncrement(temp);
            }
        });

        BlackSmith.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Blacksmithid) {
                int temp =(test.getPassiveIncrement());
                temp+=10;
                test.setPassiveIncrement(temp);
            }
        });

        Church.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Churchid) {
                int temp =(test.getPassiveIncrement());
                temp+=10;
                test.setPassiveIncrement(temp);
            }
        });

        Townhall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Townhallid) {
                int temp =(test.getPassiveIncrement());
                temp+=10;
                test.setPassiveIncrement(temp);
            }
        });

        Barracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Barracksid) {
                int temp =(test.getPassiveIncrement());
                temp+=10;
                test.setPassiveIncrement(temp);
            }
        });

        Library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View Libraryid) {
                int temp =(test.getPassiveIncrement());
                temp+=10;
                test.setPassiveIncrement(temp);
            }
        });

    }

}

