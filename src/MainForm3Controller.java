import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainForm3Controller {
    public Label NameIdLable;
    public Label ScoreIdLable;
    public AnchorPane Windo3Id;

    public void PlayAgainOnAction(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) Windo3Id.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("MainForm.fxml"))));
    }
}
