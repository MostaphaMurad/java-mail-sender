package com.emailsender.service;

import javax.mail.MessagingException;

/**
 * @author: Mostafa Murad
 * @created: 3/29/2023 on 7:15 PM
 **/
public interface EmailSenderService {
    void sendEmail(String to,String subject,String message) throws MessagingException;
}
