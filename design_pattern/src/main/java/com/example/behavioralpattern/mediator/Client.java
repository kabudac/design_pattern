package com.example.behavioralpattern.mediator;

/**
 * @Author: kabudac
 * @Date: 2022-04-22 09:58:16
 * @Description: 
 */
public class Client {
    public static void main(String[] args) {
        MeditorStructure mediator = new MeditorStructure();

        HouseOwner houseOwner = new HouseOwner("张三",mediator);
        Tenant tenant = new Tenant("李四",mediator);

        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.contack("需要租房子");
        houseOwner.contact("我这里有房子");

    }
}
