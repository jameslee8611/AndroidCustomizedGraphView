package com.linechartexample.types;

import android.content.Context;
import android.graphics.Color;

import com.jjoe64.graphview.GraphViewSeries;
import com.jjoe64.graphview.LineGraphView;
import com.jjoe64.graphview.GraphView.GraphViewData;
import com.jjoe64.graphview.GraphViewSeries.GraphViewSeriesStyle;
import com.linechartexample.R;

public class Daily extends Graph{
	public Daily(Context context) {
		super(context);
	}
	
	public void setSeries(float[] data) {
		GraphViewSeriesStyle seriesStyle = new GraphViewSeriesStyle(Color.BLUE, 3);

		GraphViewData [] arr = new GraphViewData[7];
		for (int idx = 0; idx < 7; idx++)
		{
			if(idx >= data.length) {
				arr[idx] = new GraphViewData(idx, 0);
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
		super.graphView.setHorizontalLabels(new String[] {"12am", "5am", "1pm", "4pm", "7pm", "9pm", "12am"});
		
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
