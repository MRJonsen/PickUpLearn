package com.cb;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/9/3
 * @Version 1.0
 */
public class Customer {
    public static void main(String[] args) throws JMSException {

        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
                ActiveMQConnection.DEFAULT_PASSWORD, ActiveMQConnection.DEFAULT_BROKER_URL);
        Connection connection = activeMQConnectionFactory.createConnection();
        connection.start();
        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
//        Destination destination = session.createQueue("my-queue");
        Topic topic = session.createTopic("test-topic");
        // MessageProducer：消息生产者
        MessageProducer producer = session.createProducer(topic);
        // 设置不持久化
//        producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
        // 发送一条消息
        for (int i = 1; i <= 5; i++) {
            sendMsg(session, producer, i);
        }
        session.close();
        connection.close();

    }

    public static void sendMsg(Session session, MessageProducer producer, int i) throws JMSException {
        // 创建一条文本消息
        TextMessage message = session.createTextMessage("Hello ActiveMQ！" + i);
        // 通过消息生产者发出消息
        producer.send(message);
    }

}
