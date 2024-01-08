package org.lustigproject.commonlibrarymessaging;

import org.lustigproject.commonlibrarymessaging.messages.Message;

public interface Producer {
    void sendMessage(String topic, Message message);
}
