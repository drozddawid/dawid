package com.drozd.nauka;

import com.drozd.nauka.model.Human;
import com.drozd.nauka.service.HumanSerializer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human("Michal","Gasad"));
        humanList.add(new Human("Bartosz","Michalakj"));
        File humanDataFile = new File("humans.json");
        HumanSerializer humanSerializer = new HumanSerializer();
        humanSerializer.humanListToJson(humanList, humanDataFile);

    }
}
