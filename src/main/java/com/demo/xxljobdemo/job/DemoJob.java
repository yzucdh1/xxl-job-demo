package com.demo.xxljobdemo.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * @author chendonghui
 * @version 1.0.0
 * @create 2022/4/1 14:06
 */
@Component
public class DemoJob {

    @XxlJob("demoJobHandler")
    public ReturnT<String> demoJobHandler() {
        String param = XxlJobHelper.getJobParam();
        XxlJobHelper.log("XXL-JOB, Hello World：{}", param);
        return ReturnT.SUCCESS;
    }

}
