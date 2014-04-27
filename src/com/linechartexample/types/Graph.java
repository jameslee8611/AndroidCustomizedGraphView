package com.linechartexample.types;

import android.content.Context;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.GraphViewSeries;

public abstract class Graph {
	protected GraphViewSeries seriesData;
	protected GraphView graphView;
	protected Context context;
	protected String title = "Default";

	public Graph(Context context) {
		this.context = context;
	}

	public abstract void makeGraph();
	public abstract void setSeries(float[] data);
	
	public void setTitle(String title) {
		this.title = title;
	}

	public GraphView getGraphView() {
		return graphView;
	}
}
