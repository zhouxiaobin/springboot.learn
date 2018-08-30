package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


	@Autowired
	private  BlogProperties  blogProperties;

	@Test
	public void contextLoads() {

	}


    // TODO: 2018/8/30  application.properties配置中文读取乱码问题
    @Test
	public  void getHello() throws Exception{
        Assert.assertEquals(blogProperties.getName(), "testDD");
        Assert.assertEquals(blogProperties.getTitle(),"Spring Bootttt教程");
    }
}
