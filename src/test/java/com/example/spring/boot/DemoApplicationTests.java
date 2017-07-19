package com.example.spring.boot;

import com.example.spring.boot.dao.CustomerMapper;
import com.example.spring.boot.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    public CustomerMapper customerMapper;
    @Test
    public void contextLoads() {
        Customer customer = customerMapper.selectByPrimaryKey(14l);
        System.out.println(customer.getCustName());
    }
}
