package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;


public class MenuScreen implements Initializable{
    private Stage primaryStage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void switch_to_play(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    public void load_game(ActionEvent event) throws IOException, ClassNotFoundException {
        Saving_class get_it = null;
        FileInputStream filein = new FileInputStream("C:\\Users\\Shivansh\\Downloads\\game (1)\\game\\save_new_game.ser");
        ObjectInputStream in = new ObjectInputStream(filein);
        get_it = (Saving_class) in.readObject();
        in.close();
        filein.close();
        System.out.println("score: "+get_it.score);
        Controller.game_coins=get_it.coins;
        Controller.game_score= get_it.score;
        Controller.x_co = get_it.x_coordinate;
        Controller.x_back = get_it.screen_back;
        System.out.println("oh yeah this is working!!");
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    public void exit_game(ActionEvent event) throws IOException {
        System.exit(0);
    }
}
