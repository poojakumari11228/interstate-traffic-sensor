package kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

    private final SpeedCalculator speedCalculator;

    @Autowired
    OwnerService(SpeedCalculator speedCalculator){
        this.speedCalculator = speedCalculator;
    }

    @KafkaListener(topics = {"tofasttopic"})
    public void receive(@Payload SpeedRecord speedRecord,
                        @Headers MessageHeaders headers) {
        System.out.println("Owner : tofasttopic received message ="+ speedRecord.toString());
//        speedCalculator.handleRecord(sensorRecord);
    }

}