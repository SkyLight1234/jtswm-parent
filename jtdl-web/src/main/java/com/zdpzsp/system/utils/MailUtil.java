package com.zdpzsp.system.utils;

import com.zdpzsp.system.utils.vo.EmailContent;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

/*import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;*/
public class MailUtil {
    public static void main(String args[]){
        try {
            EmailContent emailContent=new EmailContent();
            emailContent.setContent("abc");
            emailContent.setReceice_mail("1032960260@qq.com");
            emailContent.setSubject("验证码");
            send_email(new EmailContent());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void send_email(EmailContent content) throws IOException, AddressException, MessagingException {

        String to = content.getReceice_mail();
        String subject = content.getSubject();//邮件主题G:\ide\FamilyhomeManager\jtdl-web\target\classes\email.properties
        String text = content.getContent();//邮件内容
        Properties properties = new Properties();
        InputStream resourceAsStream = null;
        try {

            resourceAsStream=null;
          //  MailUtil.class.getClassLoader().getResourceAsStream("./email.properties");
           // String path = MailUtil.class.getClassLoader().getResourceAsStream("./email.properties");
            resourceAsStream =  MailUtil.class.getClassLoader().getResourceAsStream("email.properties");
            System.out.println();
           // resourceAsStream =new FileInputStream(resourceAsStream);/Users/zhangdepeng/IdeaProjects/jtswm-parent/jtdl-web/src/main/resources/email.properties
            properties.load(resourceAsStream);
        } finally{
            if (resourceAsStream!=null) {
                resourceAsStream.close();
            }
        }
        System.err.println("properties:"+properties);
        Authenticator authenticator = new Email_Authenticator(properties.get("username").toString(), properties.get("password").toString());
        Session session = Session.getInstance(properties, authenticator);
        Transport transport = session.getTransport();
        transport.connect();
        MimeMessage mailMessage = new MimeMessage(session);
        mailMessage.setFrom(new InternetAddress(properties.get("username").toString()));
        // Message.RecipientType.TO属性表示接收者的类型为TO
        mailMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
        mailMessage.setSubject(subject, "UTF-8");
        mailMessage.setSentDate(new Date());
        // MiniMultipart类是一个容器类，包含MimeBodyPart类型的对象
        Multipart mainPart = new MimeMultipart();
        // 创建一个包含HTML内容的MimeBodyPart
        BodyPart html = new MimeBodyPart();
        html.setContent(text.trim(), "text/html; charset=utf-8");
        mainPart.addBodyPart(html);
        mailMessage.setContent(mainPart);
        Transport.send(mailMessage);
    }
}