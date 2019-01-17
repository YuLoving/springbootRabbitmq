package cn.nj.springbootone.mqcallback;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;

/**
 * 消息发送到交换机确认机制
 * */
public class MsgSendConfirmCallBack implements RabbitTemplate.ConfirmCallback {

    @Override
    public void confirm(CorrelationData correlationData, boolean ask, String cause) {
        System.out.println("MsgSendConfirmCallBack,回调id"+correlationData);
            if(ask){
                System.out.println("消息消费成功");
            }
            else{
                System.out.println("消息消费失败"+cause+"\n 重新发送");
            }
    }
}
