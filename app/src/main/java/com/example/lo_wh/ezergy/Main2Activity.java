package com.example.lo_wh.ezergy;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Main2Activity extends AppCompatActivity {

    boolean status = false;
    int month = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        checkStatus(status,month);

        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                new DataPoint(0, 50),
                new DataPoint(1, 24),
                new DataPoint(2, 3),
                new DataPoint(3, 22),
                new DataPoint(4, 65)
        });

        graph.addSeries(series);
    }

    public void checkStatus(boolean status, int month)
    {
        TextView billingStatusText = findViewById(R.id.billingStatus);

        if (status == false)
        {
            billingStatusText.setTextColor(Color.GREEN);
            billingStatusText.setText("CLEAR");
        }
        else
        {
            billingStatusText.setTextColor(Color.RED);
            billingStatusText.setText("PENDING " + Integer.toString(month) + "MONTH(S) PAYMENT");
        }
    }

}
