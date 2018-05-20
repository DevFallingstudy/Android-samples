package com.example.stard.sampleproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private int targetPosition = 0;

    @BindView(R.id.progressbar1) ProgressBar bnp;

    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;
    @BindView(R.id.btn3)
    Button btn3;
    @BindView(R.id.btn4)
    Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initUI();

        /*
        1. 버튼을 누르면 프로그레스가 바뀐다.
        2. 근데 한번에 바뀌면 안된다.
        3. 시간을 두고 차례차례 바뀌어야한다.
         */
    }

    private void initUI () {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                targetPosition = 0;

                final Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                int progress = bnp.getProgress();
                                if (progress == targetPosition) {
                                    timer.cancel();
                                }else {
                                    Log.i("WTF", progress + " | " + targetPosition);
                                    if (progress > targetPosition) {
                                        bnp.incrementProgressBy(-1);
                                    }else if (progress < targetPosition){
                                        bnp.incrementProgressBy(1);
                                    }
                                }
                            }
                        });
                    }
                }, 0, 10);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                targetPosition = 31;
                final Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                int progress = bnp.getProgress();
                                if (progress == targetPosition) {
                                    timer.cancel();
                                }else {
                                    Log.i("WTF", progress + " | " + targetPosition);
                                    if (progress > targetPosition) {
                                        bnp.incrementProgressBy(-1);
                                    }else if (progress < targetPosition){
                                        bnp.incrementProgressBy(1);
                                    }
                                }
                            }
                        });
                    }
                }, 0, 10);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                targetPosition = 56;
                final Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                int progress = bnp.getProgress();
                                if (progress == targetPosition) {
                                    timer.cancel();
                                }else {
                                    Log.i("WTF", progress + " | " + targetPosition);
                                    if (progress > targetPosition) {
                                        bnp.incrementProgressBy(-1);
                                    }else if (progress < targetPosition){
                                        bnp.incrementProgressBy(1);
                                    }
                                }
                            }
                        });
                    }
                }, 0, 10);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                targetPosition = 100;
                final Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                int progress = bnp.getProgress();
                                if (progress == targetPosition) {
                                    timer.cancel();
                                }else {
                                    Log.i("WTF", progress + " | " + targetPosition);
                                    if (progress > targetPosition) {
                                        bnp.incrementProgressBy(-1);
                                    }else if (progress < targetPosition){
                                        bnp.incrementProgressBy(1);
                                    }
                                }
                            }
                        });
                    }
                }, 0, 10);
            }
        });
    }
}
