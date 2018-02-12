import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*; //all the packages needed to implement Java FX app

public class ConfirmBox {

    static Boolean answer; // holds yes or no answer if user wants to exit window

    public static boolean  infoDisplay(String title, String message) {
        Stage window = new Stage();


        //Stop user from accessing any other window before closing this one
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);

        Button yesButton = new Button("Yes, I'm sure!");
        Button noButton  = new Button ("No, Take me back!");

        yesButton.setOnAction(e -> {

            answer = true;
            window.close();
                });

        noButton.setOnAction( e-> {

            answer =false;
            window.close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER); //Center everything within window

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait(); //make sure window is closed before returning back


        return answer ;
    }
}

