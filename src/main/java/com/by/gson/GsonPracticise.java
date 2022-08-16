package com.by.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.*;


public class GsonPracticise {


    public static void main(String[] args) throws IOException {
        Resource resource = new ClassPathResource("Product.json");
       // InputStream input = resource.getInputStream();
        File file = resource.getFile();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Object object = gson.fromJson(new FileReader(file), Object.class);

        String json = gson.toJson(object);
        System.out.println(json);

        gson.toJson(object, new FileWriter("src/main/resources/fileName.json"));


        Product product = new Product(124,"helloworld",145);

        String json1 = gson.toJson(product);
        System.out.println(json1);
        // 2. JSON string to Java object
        /*String json = "{'name' : 'mkyong'}";
        Object object = gson.fromJson(json, Staff.class);*/
    }



}
