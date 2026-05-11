package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReaderManager {
    private static FileInputStream fileInputStream;
    private static Properties property;

    public static void setupProperty(){
        File file = new File("C:\\Users\\Ajith M\\IdeaProjects\\FirstProject\\src\\main\\resources\\TestData.properties");
        try {
            fileInputStream = new FileInputStream(file);
        property = new Properties();
        property.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static String getDataProperty(String value){
setupProperty();
String data=property.getProperty(value);
return data;
    }
}
