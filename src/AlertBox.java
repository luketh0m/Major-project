import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*; //all the packages needed to implement Java FX app

public class AlertBox {

    public static void infoDisplay(String title, String message) {
        Stage window = new Stage();

        //Stop user from accessing any other window before closing this one
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button ("Got it!");
        closeButton.setOnAction( e -> window.close()); //Read box and close

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER); //Center everything within window

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait(); //make sure window is closed before returning back

    }
}

