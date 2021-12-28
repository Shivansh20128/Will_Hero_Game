package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;

public class PauseScene {
    private Stage primaryStage;
    @FXML
    private void resume(ActionEvent we) throws IOException, ClassNotFoundException {
        Saving_class get_it = null;
        FileInputStream filein = new FileInputStream("C:\\Users\\Shivansh\\Downloads\\game (1)\\game\\saved.ser");
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
        primaryStage = (Stage)((Node)we.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();

    }

    @FXML
    private void save_game(ActionEvent we) throws IOException, ClassNotFoundException {
        Saving_class try_obj = new Saving_class();
        try_obj.coins=Controller.game_coins;
        try_obj.score=Controller.game_score;
        try_obj.x_coordinate=Controller.x_layout_warrior;
        try_obj.screen_back=Controller.x_layout_warrior;
        FileOutputStream fileout = new FileOutputStream("save_new_game.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileout);
        out.writeObject(try_obj);
        out.close();
        fileout.close();

    }

    @FXML
    private void exit(ActionEvent we) throws IOException {
        System.out.println("oh yeah this is working!!");
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        primaryStage = (Stage)((Node)we.getSource()).getScene().getWindow();
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
