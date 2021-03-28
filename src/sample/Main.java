package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage){

        try {

            Parent root = FXMLLoader.load(getClass().getResource("FXML/LoginMain.fxml"));
            Scene scene = new Scene(root, 765, 528);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.setResizable(false);
        } catch(Exception e){
            e.printStackTrace();
        }
//        primaryStage.initStyle(StageStyle.UNDECORATED);
//
//        root.setOnMousePressed(event -> {
//            x = event.getSceneX();
//            y = event.getSceneY();
//        });
//
//        root.setOnMouseDragged(event -> {
//            primaryStage.setX(event.getSceneX() - x);
//            primaryStage.setY(event.getSceneX() - y);
//        });
//
//        primaryStage.setScene(new Scene(root, 1080, 720));
//        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
