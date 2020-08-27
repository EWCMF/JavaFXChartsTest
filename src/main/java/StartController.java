import javafx.fxml.FXML;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.XYChart;

public class StartController {
    @FXML
    private AreaChart<Integer, Double> tempAreaChart, humidAreaChart;

    public void initialize() {
        XYChart.Series<Integer, Double> tempData = new XYChart.Series<>();
        tempData.getData().add(new XYChart.Data<>(0, 27.0));
        tempData.getData().add(new XYChart.Data<>(1, 28.0));
        tempData.getData().add(new XYChart.Data<>(2, 29.0));
        tempData.getData().add(new XYChart.Data<>(3, 30.0));
        tempData.setName("Today");

        XYChart.Series<Integer, Double> humidData = new XYChart.Series<>();
        humidData.getData().add(new XYChart.Data<>(0, 40.0));
        humidData.getData().add(new XYChart.Data<>(1, 50.0));
        humidData.getData().add(new XYChart.Data<>(2, 55.5));
        humidData.getData().add(new XYChart.Data<>(3, 60.0));
        humidData.setName("Today");

        tempAreaChart.getData().add(tempData);
        humidAreaChart.getData().add(humidData);
    }
}
