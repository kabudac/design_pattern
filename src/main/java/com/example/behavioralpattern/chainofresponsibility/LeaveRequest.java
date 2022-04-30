package com.example.behavioralpattern.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 17:14:25
 * @Description: 请假条 
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LeaveRequest {
    private String name;
    private int num;
    private String content;
}
