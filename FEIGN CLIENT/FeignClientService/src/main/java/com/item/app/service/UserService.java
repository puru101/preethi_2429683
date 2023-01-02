package com.item.app.service;

import com.item.app.common.ResponseDto;
import com.item.app.model.User;

public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}