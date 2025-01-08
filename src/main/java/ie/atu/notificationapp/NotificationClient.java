package ie.atu.notificationapp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "notification-service", url = "http://localhost:8083/notification")
interface NotificationClient {

    @PostMapping("/send")
    void sendNotification(@RequestBody String message);
}
