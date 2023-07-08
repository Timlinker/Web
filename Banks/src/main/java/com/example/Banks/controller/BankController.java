package com.example.Banks.controller;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.ui.Model;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.Charset;
import com.example.Banks.model.ED807;

@RestController
public class BankController
{

    @GetMapping(value="/banks")
    public String index()
    {
        return "index";
    }

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file, Model model)
    {
        try
        {
            byte[] data = file.getBytes();
            JSONObject xmlJSONObj = XML.toJSONObject(new String(data, Charset.forName("cp1251")), true);
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                    .configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true)
                    .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            String json = xmlJSONObj.toString();
            ED807 dto = mapper.readValue(json, ED807.class);

            model.addAttribute("data", dto);
            return "index";
        } catch (Exception e)
        {
            model.addAttribute("error", "Ошибка загрузки и обработки файла");
            return "index";
        }
    }
}
