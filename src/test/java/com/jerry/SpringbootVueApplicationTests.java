package com.jerry;

import com.jerry.common.base.Results;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class SpringbootVueApplicationTests {

    @Test
    public void contextLoads() {
        ResponseEntity<Object> success = Results.success();
        System.out.println("哈哈哈："+Results.success().toString());
    }

}
