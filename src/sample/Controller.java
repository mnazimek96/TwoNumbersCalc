package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField number1;
    @FXML
    private TextField number2;
    @FXML
    private Label result;

    @FXML
    public void add(){
        double a = Double.parseDouble(number1.getText());
        double b = Double.parseDouble(number2.getText());
        String res = Double.toString(a+b);
        result.setText(res);
    }

    @FXML
    public void subtract(){
        double a = Double.parseDouble(number1.getText());
        double b = Double.parseDouble(number2.getText());
        String res = Double.toString(a-b);
        result.setText(res);
    }

    @FXML
    public void multiply(){
        double a = Double.parseDouble(number1.getText());
        double b = Double.parseDouble(number2.getText());
        String res = Double.toString(a*b);
        result.setText(res);
    }

    @FXML
    public void divide() {
        double a = Double.parseDouble(number1.getText());
        double b = Double.parseDouble(number2.getText());
        if(b == 0){
            result.setText("Error!");
        } else {
            String res = Double.toString(a / b);
            result.setText(res);
        }
    }
}
