package com.spy.apollo.test;

import com.alibaba.fastjson.JSON;
import com.spy.apollo.test.util.TestProgress;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;


/**
 * 测试抽象类
 *
 * @author shi.pengyan
 * @version 1.0 2017-06-30 12:42
 * @since 1.0
 */
@Slf4j
public abstract class AbstractApolloTest {


    // 在Console里打印Case的开始与结束，更容易分清Console里的日志归属于哪个Case.
    @Rule
    public TestRule testProgress = new TestProgress();

//    @Autowired
//    protected ApplicationContext ctx;

    @Autowired
    protected AbstractApplicationContext ctx;


    /**
     * 输出内容
     *
     * @param obj
     */
    protected void print(Object obj) {
        log.debug("obj={}", JSON.toJSONString(obj, true));
    }


    @After
    public void destroy() {
        if (ctx != null) {
            ctx.registerShutdownHook();
        }
    }
}
