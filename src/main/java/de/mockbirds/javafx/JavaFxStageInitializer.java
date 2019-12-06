package de.mockbirds.javafx;

import de.mockbirds.javafx.JavaFxApp.StageReadyEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class JavaFxStageInitializer implements ApplicationListener<StageReadyEvent> {

    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        Stage stage = event.getStage();

        StackPane rootPane = new StackPane();
        rootPane.setPrefSize(500, 500);
        Button button = new Button("Hello JavaFX with Spring Boot!");
        rootPane.getChildren().add(button);

        stage.setScene(new Scene(rootPane));
        stage.show();
    }
}
