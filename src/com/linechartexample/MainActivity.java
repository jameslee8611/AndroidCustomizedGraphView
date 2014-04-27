package com.linechartexample;

import com.jjoe64.graphview.GraphView;
import com.linechartexample.types.Daily;
import com.linechartexample.types.Graph;
import com.linechartexample.types.Monthly;
import com.linechartexample.types.Weekly;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		float[] data = { 1000.0f, 200.0f, 300.0f, 400.0f, 300.0f, 600.0f, 150f };
		
		Graph graph = new Monthly(this);
		graph.setTitle("Pedometer");
		graph.setSeries(data);
		graph.makeGraph();
		GraphView graphView = graph.getGraphView();
		
		LinearLayout layout = (LinearLayout) findViewById(R.id.graph1);
		layout.addView(graphView);
	}
}
