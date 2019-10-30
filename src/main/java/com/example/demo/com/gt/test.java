package com.example.demo.com.gt;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.com.gt.util.CommonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Administrator on 2019/9/24.
 */
@Slf4j
@Controller
@RequestMapping("/kafka")
public class test {


    @Autowired
    private KafkaTemplate  kafkaTemplate;

    /**
     * 获取菜品规格信息
     * @param response
     * @throws IOException
     */
    @PostMapping("/test")
    public void findSpeByFoodId(HttpServletResponse response) throws IOException {
        try {
            CommonUtil.write(response,"success !");
        } catch (Exception e) {
            log.error("context", e);
            CommonUtil.write(response, "false");
        }
    }

    @PostMapping("/send")
    public String send(){

        JSONObject object = new JSONObject();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        object.put("requstTime",df.format(new Date()));
        object.put("name","byron_Chu1");
        log.error("test=====>test22222");
        ListenableFuture<SendResult<String, Object>> future = kafkaTemplate.send("goods_mylog", JSONObject.toJSONString(object));
        future.addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {
            @Override
            public void onFailure(Throwable throwable) {
                log.info("Produce: The message failed to be sent:" + throwable.getMessage());
            }

            @Override
            public void onSuccess(@Nullable SendResult<String, Object> stringObjectSendResult) {
                // TODO 业务处理
                log.info("Produce: The message was sent successfully:");
                log.info("Produce: _+_+_+_+_+_+_+ result: " + stringObjectSendResult.toString());


            }
        });
        return "success add";
    }





}
