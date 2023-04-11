package com.emailsender.resources;
import lombok.Data;
/**
 * @author: Mostafa Murad
 * @created: 3/30/2023 on 6:35 PM
 **/
@Data
public class EmailMessage {
    private String to;
    private String subject;
    private String message;
}
