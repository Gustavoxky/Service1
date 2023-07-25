package com.analytics.message;


import com.analytics.dto.CarPostDTO;
import com.analytics.service.PostAnalyticsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerMessage {

    private final Logger LOG = LoggerFactory.getLogger(KafkaConsumerMessage.class);

    @Autowired

    private PostAnalyticsService postAnalyticsService;

    @KafkaListener(topics = "car-posts-topics", groupId = "analytics-posts-group")
    public void listening(@Payload CarPostDTO carPost) {
        System.out.println("Received Car Post information: " + carPost);
        LOG.info("Received car post information: {}", carPost);
        postAnalyticsService.saveDataAnalytics(carPost);
    }
}
