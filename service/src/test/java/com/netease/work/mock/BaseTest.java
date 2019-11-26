package com.netease.work.mock;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * description:
 * Date: 2018-09-04 上午10:31<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
@ComponentScan(value = "com.netease.work")
public class BaseTest {
}
