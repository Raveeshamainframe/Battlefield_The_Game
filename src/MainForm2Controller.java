import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class MainForm2Controller {
    public CheckBox T56IdA;
    public CheckBox TankIdA;
    public CheckBox PistolIdA;
    public CheckBox BombIdA;
    public CheckBox T56IdB;
    public CheckBox TankIdB;
    public CheckBox PistolIdB;
    public CheckBox BombIdB;
    public CheckBox MultiBabellIdA;
    public CheckBox MultiBarellIdB;
    public AnchorPane Window2Id;


    public void BattleStartOnAction(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) Window2Id.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("MainForm3.fxml"))));

    }


    public void T56OnActionA(ActionEvent actionEvent) {
        Weapon w1=new T56();
        w1.Shoot();
        w1.getScore();
        PlayerAWeponStore.setValue(w1.getScore());

    }

    public void TankOnActionA(ActionEvent actionEvent) {
        Weapon w1=new Tank();
        w1.getScore();
        w1.Shoot();
        PlayerAWeponStore.setValue(w1.getScore());

    }

    public void PistolOnAction(ActionEvent actionEvent) {
        Weapon w1=new Pistol();
        w1.getScore();
        w1.Shoot();
        PlayerAWeponStore.setValue(w1.getScore());
    }

    public void BombOnActionA(ActionEvent actionEvent) {
        Weapon w1=new Bomb();
        w1.getScore();
        w1.Shoot();
        PlayerAWeponStore.setValue(w1.getScore());
    }

    public void T56OnActionB(ActionEvent actionEvent) {
        Weapon w1=new T56();
        w1.getScore();
        w1.Shoot();
       PlayerBWeaponStore.setValue(w1.getScore());
    }

    public void TankOnActionB(ActionEvent actionEvent) {
        Weapon w1=new Tank();
        w1.getScore();
        w1.Shoot();
        PlayerBWeaponStore.setValue(w1.getScore());
    }

    public void PistolOnActionB(ActionEvent actionEvent) {
        Weapon w1=new Pistol();
        w1.getScore();
        w1.Shoot();
        PlayerBWeaponStore.setValue(w1.getScore());
    }

    public void BombOnActionB(ActionEvent actionEvent) {
        Weapon w1=new Bomb();
        w1.getScore();
        w1.Shoot();
        PlayerBWeaponStore.setValue(w1.getScore());
    }

    public void MyltiOnActionA(ActionEvent actionEvent) {
        Weapon w1=new MultiBarrel();
        w1.getScore();
        w1.Shoot();
        PlayerAWeponStore.setValue(w1.getScore());
    }

    public void MultiOnActionB(ActionEvent actionEvent) {
        Weapon w1=new MultiBarrel();
        w1.getScore();
        w1.Shoot();
        PlayerBWeaponStore.setValue(w1.getScore());
    }
}
