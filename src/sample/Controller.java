package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    public TextField userInput;

    @FXML
    public Button clickyBtn;

    public int whatClick = 0;

    public String userName = "";

    public String userAge = "";

    public String userYear = "";

    public Text questionText;

    public String[] questions = {
            "What is your name",
            "What is your age",
            "What is the year"
    };


    public void clickClickyBtn(ActionEvent actionEvent) {
        whatClick++;

        if (whatClick == 1) {
            userName = userInput.getText();
            questionText.setText(questions[1]);
            userInput.clear();
        } else if (whatClick == 2) {
            userAge = userInput.getText();
            questionText.setText(questions[2]);
            userInput.clear();
        } else if (whatClick == 3) {
            userYear = userInput.getText();
            userInput.clear();

            int age = Integer.parseInt(userAge);
            int year = Integer.parseInt(userYear);

            userInput.setVisible(false);


            String finalOutPut = userName + " will be " + (age + 1) + " in the year " + (year + 1);

            questionText.setText(finalOutPut);

            clickyBtn.setText("Reset");
            userInput.setDisable(true);
        } else if (whatClick >= 4) {
            clickyBtn.setText("Submit");
            whatClick = 0;
            questionText.setText(questions[0]);
            userInput.setDisable(false);
            userInput.setVisible(true);


        }

    }

}




