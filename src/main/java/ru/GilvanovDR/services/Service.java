/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.services;

import org.apache.log4j.Logger;
import ru.GilvanovDR.model.JsonEntity;
import ru.GilvanovDR.repository.RepoInterface;
import ru.GilvanovDR.repository.embeddedRepo;


public class Service implements ServiceInterface {
    RepoInterface repo = new embeddedRepo();
    //OpenHWGetter openHWGetter = new OpenHWGetter(this);
    private static final Logger log = Logger.getLogger(Service.class);

    public Service() {
        // openHWGetter.start();
    }

    @Override
    public void setValue(String nameOfValue, double value) {
        repo.setValue(nameOfValue, value);
    }

    @Override
    public double getValue(String nameOfValue) {
        return repo.getValue(nameOfValue);
    }

    @Override
    public String getJson(String ip) {
        JsonEntity jsonEntity = JsonReader.readJsonFromUrl("http://" + ip + ":8085/data.json");
        if (jsonEntity != null) {
            return jsonEntity.getChildren(0).getText() + "(" + ip + ")" + '\n'
                    //MbName(Chipset)
                    + jsonEntity.getChildren(0).getChildren(0).getText()
                    + "(" + jsonEntity.getChildren(0).getChildren(0).getChildren(0).getText() + ")" + '\n'
                    //CpuName
                    + jsonEntity.getChildren(0).getChildren(1).getText()  +  '\n'
                    + "Cpu used: " +  jsonEntity.getChildren(0).getChildren(1).getChildren(2).getChildren(0).getValue() + '\n'
                    + "Cpu temp: " + jsonEntity.getChildren(0).getChildren(1).getChildren(1).getLastChildren().getValue() + '\n'
                    //MemStatus
                    + "Memory Used: " + jsonEntity.getChildren(0).getChildren(2).getChildren(1).getChildren(0).getValue()+ '\n'
                    + "Memory Free: " + jsonEntity.getChildren(0).getChildren(2).getChildren(1).getChildren(1).getValue();
        } else return "Null";
    }
}
