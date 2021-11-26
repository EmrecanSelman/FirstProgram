package IneedAnotherWay;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

import java.io.IOException;



public class helper {
    public void changeView(AnchorPane parent, Node child, int delay) {
        Platform.runLater(() -> {
            parent.getChildren().clear();
            child.setOpacity(0);
            setAnchor(child, 540.0, 540.0, 540.0, 540.0);
            parent.getChildren().add(child);
            fadeIn(child, delay);
        });
    }
    public void fadeIn(Node node, int mills) {
        node.toFront();
        FadeTransition ft = new FadeTransition(Duration.millis(mills), node);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.setAutoReverse(false);
        ft.setCycleCount(1);
        ft.play();
    }
    public static void setAnchor(Node node, Double left, Double top, Double right, Double bottom) {
        AnchorPane.setLeftAnchor(node, left);
        AnchorPane.setTopAnchor(node, top);
        AnchorPane.setRightAnchor(node, right);
        AnchorPane.setBottomAnchor(node, bottom);
    }
    public static Parent load(String location, Object controller) throws IOException {
        FXMLLoader loader=new FXMLLoader(CONTROLLER.class.getResource(location));
        loader.setController(null);
        return loader.load();
    }
}
