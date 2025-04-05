module ayaz.com.demo1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.poi.poi;
    requires org.apache.poi.ooxml;

    opens ayaz.com.demo1 to javafx.fxml;
    exports ayaz.com.demo1;
}