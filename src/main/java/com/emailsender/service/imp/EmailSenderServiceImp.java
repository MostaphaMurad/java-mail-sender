package com.emailsender.service.imp;
import com.emailsender.models.Employees;
import com.emailsender.service.EmailSenderService;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.List;

/**
 * @author: Mostafa Murad
 * @created: 3/29/2023 on 7:21 PM
 **/
@Service
@RequiredArgsConstructor
public class EmailSenderServiceImp implements EmailSenderService {
    private final JavaMailSender javaMailSender;
    private final EmployeeServiceImp employeeServiceImp;
    @Override
    public void sendEmail(String to, String subject, String message) throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
        mimeMessageHelper.setFrom("momofcis96@gmail.com");
        mimeMessageHelper.setTo(to);
        mimeMessageHelper.setSubject(subject);

        List<Employees>employees=getEmps();
       String tableContent=formMessage(employees);
        mimeMessageHelper.setText(tableContent,true);
        this.javaMailSender.send(mimeMessageHelper.getMimeMessage());
    }
  private  List<Employees>getEmps(){
        return employeeServiceImp.getAllEmployees();
    }
    private String formMessage(List<Employees> employees){
        String msg = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "   <head>\n" +
                "      <style>  table {  font-family: arial, sans-serif;  border-collapse: collapse;  width: 100%;}td, th {border: 1px solid #dddddd;text-align: left;padding: 8px; }caption{text-align: left;font-size:large;font-weight: bold;}</style>\n" +
                "   </head>\n" +
                "   <body>\n" +
                "       Hello Dears   \n" +
                "       <br> \n" +
                "       <br> \n" +

                "       <br> \n" +

                "       Emplaoyee Data:  \n" +
                "       <br> \n" +
                "       <br> \n" +
                "      <table width='100%' border='1' align='center'>\n" +
                "          <tr align='center'>\n" +
                "    <th>  Name </th>\n" +
                "    <th> Phone </th>\n" +

                "    <th> Email</th>\n" +
                "    <th> Address</th>\n" +
                "    <th> Job_Title</th>\n" +
                "         </tr>";
        String text3="</table>";
        String text="";
        for(Employees emp:employees){
            text=text+"<tr align='center'>"
                    + "<td> "+ emp.getName()+" </td>"
                    + "<td> "+ emp.getPhone()+" </td>"

                    + "<td> "+ emp.getEmail()+" </td>"

                    + "<td> "+emp.getAddress()+" </td>"
                    + "<td> "+ emp.getJobTitle()+" </td>";
        }
        return msg+text+text3;
    }
}
