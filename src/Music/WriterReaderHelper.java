package Music;

import com.google.gson.Gson;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class WriterReaderHelper {//json
    public static String MUSIC_CONFIG_FOLDER_PATH = CommonFileUtil.getMusicAppConfigFolder();

    static public boolean writeToFile(ConfigModel model) {
        String jsonStr = new Gson().toJson(model);
        try (BufferedWriter write = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(MUSIC_CONFIG_FOLDER_PATH + "config.json"), StandardCharsets.UTF_8))) {
            write.write(jsonStr, 0, jsonStr.length());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    static public ConfigModel readFromFile() {
        try (
            BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(MUSIC_CONFIG_FOLDER_PATH+"config.json"),StandardCharsets.UTF_8))
        ){
            return new Gson().fromJson(reader,ConfigModel.class);
        }catch (Exception ex){
            return new ConfigModel();
        }
    }
}
