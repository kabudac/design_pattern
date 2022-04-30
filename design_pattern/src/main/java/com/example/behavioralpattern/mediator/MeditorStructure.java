package com.example.behavioralpattern.mediator;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: kabudac
 * @Date: 2022-04-22 09:54:54
 * @Description: 
 */
@Getter
@Setter
public class MeditorStructure extends Mediator{

    private HouseOwner houseOwner;
    private Tenant tenant;

    @Override
    public void contact(String message, Person person) {
        if(person==houseOwner){
            //如果是房主 则租房者获得消息
            tenant.getMessage(message);
        }else{
            houseOwner.getMessage(message);
        }
    }
    
}
