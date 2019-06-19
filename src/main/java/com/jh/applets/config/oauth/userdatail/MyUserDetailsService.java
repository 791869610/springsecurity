//package com.jh.applets.config.oauth.userdatail;
//
//import com.jh.applets.config.oauth.password.MyPasswordEncoder;
//import com.jh.applets.core.user.service.UserService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
///**
// * @program: applets
// * @description:
// * @author: jiahao
// * @create: 2019-06-19 13:59
// **/
//@Component
//@Slf4j
//public class MyUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    MyPasswordEncoder myPasswordEncoder;
//    @Autowired
//    UserService userService;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        log.info("用户的用户名: {}", username);
//        final com.jh.applets.core.user.model.User sysUser = userService.findByUserName(username);
//        if (sysUser != null) {
//            return new User(sysUser.getAccount(), sysUser.getPassword(), AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER,admin"));
//        }
//        return null;
//    }
//}
