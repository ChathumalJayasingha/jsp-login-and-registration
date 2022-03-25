package com.chathumal.jsploginandregistration.service;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author Chathumal Jayasingha | [chathumaljayasingha@hotmail.com]
 * @since - 3/25/22 | 2022-March-25[Friday]
 */

public interface UserDetailService {
    UserDetails loadUserByUsername(String username);
}
