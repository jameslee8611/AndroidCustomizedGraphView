package com.linechartexample.types;

import android.content.Context;
import android.graphics.Color;

import com.jjoe64.graphview.GraphViewSeries;
import com.jjoe64.graphview.LineGraphView;
import com.jjoe64.graphview.GraphView.GraphViewData;
import com.jjoe64.graphview.GraphViewSeries.GraphViewSeriesStyle;
import com.linechartexample.R;

public class Monthly extends Graph {
	public Monthly(Context context) {
		super(context);
	}
	
	public void setSeries(float[] data) {
		GraphViewSeriesStyle seriesStyle = new GraphViewSeriesStyle(Color.BLUE, 3);

		GraphViewData [] arr = new GraphViewData[12];
		for (int idx = 0; idx < 12; idx++)
		{
			if(idx >= data.length) {
				arr[idx] = new GraphViewData(idx, 0.0f);
			}
			else {
				arr[idx] = new GraphViewData(idx, data[idx]);
			}
		}

		seriesData = new GraphViewSeries("aaa", seriesStyle, arr);
	}

	@Override
	public void makeGraph() {
		super.graphView = new  LineGraphView(super.context, title);
		super.graphView.setBackgroundColor(Color.BLACK);
		super.graphView.setHorizontalLabels(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"});
		
		//Styling
		super.graphView.addSeries(super.seriesData); // data
		super.graphView.getGraphViewStyle().setGridColor(Color.BLACK);
		super.graphView.getGraphViewStyle().setHorizontalLabelsColor(Color.BLACK);
		super.graphView.getGraphViewStyle().setVerticalLabelsColor(Color.RED);
		super.graphView.getGraphViewStyle().setTextSize(super.context.getResources().getDimension(R.dimen.big));
		super.graphView.getGraphViewStyle().setNumHorizontalLabels(7);
		super.graphView.getGraphViewStyle().setNumVerticalLabels(10);
		super.graphView.getGraphViewStyle().setVerticalLabelsWidth(100);
	}
}
