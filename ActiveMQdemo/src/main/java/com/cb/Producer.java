package com.cb;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.IOException;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/9/3
 * @Version 1.0
 */
public class Producer {

    private MessageConsumer consumer;

    public static void main(String[] args) throws Exception {
        topicProducer();
    }


    public static void p2pProducer() throws JMSException {
        // ConnectionFactory ：连接工厂，JMS 用它创建连接
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
                ActiveMQConnection.DEFAULT_PASSWORD, "tcp://127.0.0.1:61616");
        // JMS 客户端到JMS Provider 的连接
        Connection connection = connectionFactory.createConnection();
        connection.start();
        // Session： 一个发送或接收消息的线程
        Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
        // Destination ：消息的目的地;消息发送给谁.
        // 获取session注意参数值xingbo.xu-queue是一个服务器的queue，须在在ActiveMq的console配置
        Destination destination = session.createQueue("my-queue");
        // 消费者，消息接收者
        MessageConsumer consumer = session.createConsumer(destination);
        while (true) {
            TextMessage message = (TextMessage) consumer.receive();
            if (null != message) {
                System.out.println("收到消息：" + message.getText());
                session.commit();
            } else
                break;
        }
        session.close();
        connection.close();
    }

    public static void topicProducer() throws JMSException {
        Session connectionSession = null;
        Connection connection = null;
        try {
            // ConnectionFactory ：连接工厂，JMS 用它创建连接
            ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_USER,
                    ActiveMQConnection.DEFAULT_PASSWORD, "tcp://127.0.0.1:61616");
            // JMS 客户端到JMS Provider 的连接
            connection = connectionFactory.createConnection();
            connection.start();
            // Session： 一个发送或接收消息的线程
            connectionSession = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
            Topic topic = connectionSession.createTopic("test-topic");
            // Destination ：消息的目的地;消息发送给谁.
            // 获取session注意参数值xingbo.xu-queue是一个服务器的queue，须在在ActiveMq的console配置
            // 消费者，消息接收者
            MessageConsumer consumer = connectionSession.createConsumer(topic);
            consumer.setMessageListener(new MessageListener() {
                public void onMessage(Message message) {
                    try {
                        System.out.println("接收：" + ((TextMessage) message).getText());
                    } catch (JMSException e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connectionSession != null)
                connectionSession.close();
            
            if (connection != null)
                connection.close();
        }

    }
}
