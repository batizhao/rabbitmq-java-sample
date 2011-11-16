package me.batizhao.WorkQueues;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

import java.io.IOException;

/**
 * @author: batizhao
 * @since: 11-6-27 下午5:33
 */
public class NewTask {
    private static final String QUEUE_NAME = "task_queues";

    public static void main(String[] arg) throws IOException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        //Message durability
        boolean durable = true;
        channel.queueDeclare(QUEUE_NAME, durable, false, false, null);

        String world = "one,two,tree,four,five,six,seven,eight,nine,ten";
        String message[] = world.split(",");

        for (int i = 0; i < message.length; i++) {
            channel.basicPublish("", QUEUE_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN, message[i].getBytes());
            System.out.println(" [x] Sent '" + message[i] + "'");
        }

        channel.close();
        connection.close();
    }
}
