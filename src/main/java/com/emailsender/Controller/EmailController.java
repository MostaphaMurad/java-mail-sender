package com.emailsender.Controller;
import com.emailsender.resources.EmailMessage;
import com.emailsender.service.EmailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

/**
 * @author: Mostafa Murad
 * @created: 3/30/2023 on 6:33 PM
 **/
@RestController
@RequiredArgsConstructor
public class EmailController {
    private final EmailSenderService emailSenderService;
    @PostMapping("/sendEmail")
    public ResponseEntity sendEmail(@RequestBody EmailMessage emailMessage) throws MessagingException {
        this.emailSenderService.sendEmail(emailMessage.getTo(),emailMessage.getSubject(),"");
        return ResponseEntity.ok("Success");
    }
}
