//package com.jh.applets.config.oauth.config;
//
//import com.jh.applets.config.oauth.userdatail.MyUserDetailsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.access.AccessDeniedHandler;
//import org.springframework.security.web.authentication.AuthenticationFailureHandler;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
//
///**
// * @program: applets
// * @description:
// * @author: jiahao
// * @create: 2019-06-19 12:17
// **/
//@Configuration
//public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    MyUserDetailsService myUserDetailsService;
//
//    /**
//     * 设置 HTTP 验证规则
//     * 复写这个方法来配置 {@link HttpSecurity}.
//     * 通常，子类不能通过调用 super 来调用此方法，因为它可能会覆盖其配置。 默认配置为：
//     * http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
//     * 匹配 "/" 路径，不需要权限即可访问
//     * 匹配 "/user" 及其以下所有路径，都需要 "USER" 权限
//     * 登录地址为 "/login"，登录成功默认跳转到页面 "/user"
//     * 退出登录的地址为 "/logout"，退出成功后跳转到页面 "/login"
//     * 默认启用 CSRF
//     * 用于配置权限认证的方式
//     * @param http
//     * @throws Exception
//     */
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        //cors解决跨域问题
//        http.cors().and()
//                //关闭跨站请求伪造
//                .csrf().disable()
//                .authorizeRequests()
//                //api要允许匿名访问
//                .antMatchers(HttpMethod.OPTIONS).permitAll()
////                .antMatchers("*").permitAll()
////                .antMatchers("/", "/*.html","/favicon.ico", "/css/**", "/js/**")
//                .anyRequest()
//                .permitAll()
////                .anyRequest().authenticated()
//        ;
//        // 基于token，所以不需要session
//        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//        // 解决不允许显示在iframe的问题
//        http.headers().frameOptions().disable();
//        // 禁用缓存
//        http.headers().cacheControl();
////        http.addFilter(new JWTLoginFilter(authenticationManager()));
////        http.addFilterBefore(new JWTAuthenticationFilter(authenticationManager()), UsernamePasswordAuthenticationFilter.class);
//    }
//
//    /**
//     * 密码hash算法
//     * @return
//     */
//    @Bean("passwordEncoder")
//    public PasswordEncoder myPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    /**
//     * 使用自定义身份验证组件
//     * 重写安全认证，加入密码加密方式
//     * @param auth
//     * @throws Exception
//     */
//   @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(myUserDetailsService).passwordEncoder(myPasswordEncoder());
//    }
////
////    /**
////     * 认证失败后的处理器
////     *
////     * @return
////     */
////    @Bean
////    public AuthenticationFailureHandler authenticationFailureHandler() {
////        return new CustomAuthenticationFailHandler();
////    }
////
////    /**
////     * 退出登陆处理器
////     * @return
////     */
////    @Bean
////    public LogoutSuccessHandler logoutSuccessHandler() {
////        return new CustomLogoutHandler();
////    }
////
////    /**
////     * 权限验证失败处理器
////     * @return
////     */
////    @Bean
////    public AccessDeniedHandler accessDeniedHandler() {
////        return new CustomAccessDeniedHandler();
////    }
//}
