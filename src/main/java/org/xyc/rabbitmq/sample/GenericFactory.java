package org.xyc.rabbitmq.sample;

import com.rabbitmq.client.ConnectionFactory;

public class GenericFactory {

    private static final ConnectionFactory factory = new ConnectionFactory();

    static {
        factory.setHost(Constants.SERVER_HOST);
        factory.setUsername("wks");
        factory.setPassword("wks");
    }

    public static ConnectionFactory getConnectionFactory() {
        return factory;
    }
}
