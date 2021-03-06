package searchEngine;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

/**
* Created by 王贇超 on 2017/8/3.
*/
@EnableAutoConfiguration
@SpringBootApplication
public class SearchEngineApplication {
   public static void main(String[] args) throws Exception {
       SpringApplication.run(SearchEngineApplication.class, args);
   }
}
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.CommandLineRunner;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//
//import javafx.application.Application;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.core.KafkaTemplate;
//
//import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.TimeUnit;
//
//@SpringBootApplication
//public class SearchEngineApplication implements CommandLineRunner {
//
//    public static Logger logger = LoggerFactory.getLogger(Application.class);
//
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args).close();
//    }
//
//    @Autowired
//    private KafkaTemplate<String, String> template;
//
//    private final CountDownLatch latch = new CountDownLatch(3);
//
//    @Override
//    public void run(String... args) throws Exception {
//        this.template.send("myTopic", "foo1");
//        this.template.send("myTopic", "foo2");
//        this.template.send("myTopic", "foo3");
//        latch.await(60, TimeUnit.SECONDS);
//        logger.info("All received");
//    }
//
//    @KafkaListener(topics = "myTopic")
//    public void listen(ConsumerRecord<?, ?> cr) throws Exception {
//        logger.info(cr.toString());
//        latch.countDown();
//    }
//
//}
// import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;
// import lombok.extern.slf4j.Slf4j;
// import org.apache.kafka.clients.consumer.ConsumerRecord;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.kafka.annotation.KafkaListener;
// import org.springframework.kafka.core.KafkaTemplate;

// import java.util.concurrent.CountDownLatch;
// import java.util.concurrent.TimeUnit;

// @SpringBootApplication
// @Slf4j
// public class SearchEngineApplication  implements CommandLineRunner {

//     @Autowired
//     private KafkaTemplate<String, String> template;

//     public static void main(String[] args) {
//         SpringApplication.run(SearchEngineApplication.class, args);
//     }


//     private final CountDownLatch latch = new CountDownLatch(5);

//     @Override
//     public void run(String... args) throws Exception {
//         this.template.send("myTopic", "foo1");
//         this.template.send("myTopic", "foo2");
//         this.template.send("myTopic", "foo3");
//         this.template.send("myTopic", "hi", "foo4");
//         this.template.send("myTopic2", "2", "foo5");
//         latch.await(60, TimeUnit.SECONDS);
//         log.info("All received");
//     }

//     @KafkaListener(topics = {"myTopic", "myTopic2"})
//     public void listen(ConsumerRecord<?, ?> cr) throws Exception {
//         log.info(cr.toString());
//         System.console().printf(cr.toString());
//         latch.countDown();
//     }
// }