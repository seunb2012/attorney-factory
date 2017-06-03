package com.attorney.factory;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by niebo on 2017/6/3.
 */

@Controller
@RequestMapping(value = "/api/user")
public class TestServices {

    private static final Logger LOG = Logger.getLogger(TestServices.class);

    @ResponseBody
    @RequestMapping(value = "/test")
    TestEntity testApi(String userId) {
        TestEntity testEntity = new TestEntity();
        try {
            LOG.info("Got UserId: " + userId);
            testEntity.setAddress("荣乐中路120弄");
            testEntity.setAge(28);
            testEntity.setMobileNum("18795858369");
            testEntity.setSex("男");
            testEntity.setName("聂波");
        } catch (Exception e) {
            LOG.error("[TestServices.testApi]", e);
        }
        return testEntity;
    }

}
