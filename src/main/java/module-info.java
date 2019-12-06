module de.mockbirds.javafx {

    requires javafx.controls;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.boot;

    opens de.mockbirds.javafx to spring.core;

    exports de.mockbirds.javafx;
}