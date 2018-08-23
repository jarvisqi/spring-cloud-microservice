package com.softmax.eurekafeignhystrix.service.fallback;

import com.softmax.eurekafeignhystrix.service.UserClient;
import org.springframework.stereotype.Component;

/**
 * fallback
 *
 * @author Jarvis
 * @date 2018/6/25
 */
@Component
public class UserClientFallback implements UserClient {
    @Override
    public String getUserInfo() {
        return "User / getUserInfo() : Service Unavailable";
    }

    @Override
    public int addUser() {
        return 0;
    }
}
