package com.attorney.factory;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by niebo on 2017/6/3.
 */
@Data
public class TestEntity implements Serializable {
    private String name;
    private int age;
    private String address;
    private String mobileNum;
    private String sex;
}
