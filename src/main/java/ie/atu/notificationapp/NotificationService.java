package ie.atu.notificationapp;

import org.springframework.boot.SpringApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
class NotificationService {

    @PostMapping("/send")
    public ResponseEntity<String> sendNotification(@RequestParam String message) {
        System.out.println("Notification sent: " + message);
        return ResponseEntity.ok("Notification sent");
    }


}
