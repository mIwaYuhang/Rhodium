package emu.rhodium.game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class DataParser {
    public static JsonObject GetData(String Path) {
        Gson Parser = new Gson();
        File JsonFile = new File(Path);
        BufferedReader BufRead = null;
        JsonObject ParsedFile;

        try {
            BufRead = new BufferedReader(new FileReader(JsonFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            ParsedFile = Parser.fromJson(BufRead, JsonObject.class);
        } catch (JsonSyntaxException e) {
            throw e;
        }

        return ParsedFile;
    }


}
