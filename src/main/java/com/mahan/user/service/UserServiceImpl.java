package com.mahan.user.service;

import com.mahan.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl implements UserService{
    List<User> list = new ArrayList<>();

    private void initializeUserList(){
        list.add(new User(2001L,"MAHAN","1231231234"));
        list.add(new User(2002L,"GAHAN","1231231222"));
        list.add(new User(2003L,"VARUN","1231231333"));
        list.add(new User(2004L,"SHIVA","1231231444"));
    }

    @Override
    public User getUser(Long userId) {
        initializeUserList();
        return list.stream()
                .filter(user -> user.getUserId().equals(userId))
                .findAny()
                .orElse(null);
    }
}
