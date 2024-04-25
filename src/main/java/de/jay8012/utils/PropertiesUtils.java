package de.jay8012.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class PropertiesUtils {
    private static Properties properties;
    private static int counter = 1;

    public static Properties getProperties() {
        if (properties != null) {
            if (!properties.isEmpty()) return properties;
        }
        properties = new Properties();
        try {
            String rootPath = Objects.requireNonNull(Thread.currentThread().getContextClassLoader().getResource("")).getPath();
            properties.load(new FileInputStream(rootPath + "app.properties"));
            System.out.println("counter = " + counter++);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
}
