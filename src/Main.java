import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.util.Stack;

public class Main extends Application {

    Stage window;
    Scene Homepage,soloScene,duoScene,squadsScene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        Label label1 = new Label("Homepage");

        //Button Gamemodes
        Button soloButton = new Button("Solo");
        soloButton.setOnAction(e -> window.setScene(soloScene));
        Button duoButton = new Button("Duo");
        duoButton.setOnAction(e -> window.setScene(duoScene));
        Button squadsButton = new Button("Squads");
        squadsButton.setOnAction(e -> window.setScene(squadsScene));

        //Button Go Back
        Button goBack = new Button("Go back");
        goBack.setOnAction(e -> window.setScene(Homepage));

        //Layout Homepage
        VBox layout = new VBox(20);
        layout.getChildren().addAll(soloButton,duoButton,squadsButton);
        Homepage = new Scene(layout,750,500);

        //Layout Solo Scene
        StackPane soloLayout = new StackPane();
        soloLayout.getChildren().add(goBack);
        soloScene = new Scene(soloLayout,750,500);

        //Layout Duo Scene
        StackPane duoLayout = new StackPane();
        duoLayout.getChildren().add(goBack);
        duoScene = new Scene(duoLayout,750,500);

        //Layout Squads Scene
        StackPane squadsLayout = new StackPane();
        squadsLayout.getChildren().add(goBack);
        squadsScene = new Scene(squadsLayout,750,500);

        window.setTitle("Fortnite Helper");
        window.setScene(Homepage);
        window.show();
    }

}
