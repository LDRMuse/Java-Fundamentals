package labs_examples.objects_classes_methods.labs.oop.D_my_oop.services;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.models.ChartEntry;

import java.util.ArrayList;

public class ChartEntriesImpl implements ChartEntries {

    @Override
    public void addChartEntryToChart(ChartEntry chartEntry) {
        ArrayList<ChartEntry> chart = new ArrayList<>();
        chart.add(chartEntry);
        System.out.println("Chart entry added");
        System.out.println(chart);
    }

}