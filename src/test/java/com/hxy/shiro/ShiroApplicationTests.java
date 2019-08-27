package com.hxy.shiro;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShiroApplicationTests {
	private final static org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(ShiroApplicationTests.class);

	@Test
	public void contextLoads() {
		for(int i =0;i<10;i++) {
			logger.debug("测试信息");
		}
		
		System.out.println("测试完成");
	}

}
