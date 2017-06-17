package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.helloworld.model.MessageStore;

import java.util.Date;

/**
 * @author <a href="mailto:shasrp@yahoo-inc.com">Shashikiran</a>
 */
public class HelloWorldAction extends ActionSupport {

    private MessageStore messageStore;

    public String execute() {
        messageStore = new MessageStore() ;

        return ERROR;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public String getErrorMessage() {
        return "WTF: " + new Date();
    }
}
