package com.demo.www.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Data
public class LoginData {

    String username;
    String password;
    String dashboard;

    public static List<LoginData> setData (DataTable table) {
        List<LoginData> fields = new ArrayList<>();
        List<Map<String, String>> maps = table.asMaps();
        for (Map<String, String> map : maps) {
            fields.add(new ObjectMapper().convertValue(map, LoginData.class));
        }
        return fields;

        }

}
