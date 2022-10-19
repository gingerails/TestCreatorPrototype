package cs499.team8.testcreatorprototype;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestCreatorPrototypeApplication {

    public static void main(String[] args) {
        Application.launch(JavafxApplication.class, args);
    }
}
// VM Options need this I think?
// java --module-path "C:\Program Files\Java\javafx-sdk-19\lib" --add-modules javafx.controls,javafx.fxml