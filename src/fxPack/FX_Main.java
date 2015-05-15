package fxPack;

/**
 * Created by Dan Blocker on 5/13/2015.
 */
import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;
import javafx.*;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FX_Main {
    public void start(Stage primaryStage) {
        GridPane mainPane = new GridPane();
        mainPane.getColumnConstraints().add(new ColumnConstraints(100));
        mainPane.getColumnConstraints().add(new ColumnConstraints(200));


    }
}
