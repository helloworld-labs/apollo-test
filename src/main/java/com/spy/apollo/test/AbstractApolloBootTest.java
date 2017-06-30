package com.spy.apollo.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 基于Boot的测试基类
 *
 * @author shi.pengyan
 * @version 1.0 2017-06-30 12:47
 * @since 1.0
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
// 定义每执行完一个Test文件刷新一次Spring Application Context，避免Case间的数据影响.
// 但Test文件内多个测试方法间的影响仍需注意
@DirtiesContext
public class AbstractApolloBootTest extends AbstractApolloTest {
}
