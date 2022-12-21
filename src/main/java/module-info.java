module mirea.lab.lab3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens mirea.lab.lab3 to javafx.fxml;
    exports mirea.lab.lab3;
}