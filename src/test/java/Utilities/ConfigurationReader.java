package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    //1-Create the properties object
    private static Properties properties = new Properties();

    //2-open file using FileInputStream (open file)
    static {
        //3-load properties object "file"
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);

            //-close the file in the memory
            file.close();

        } catch (IOException e) {
            System.out.println("file not found with given path");
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}
