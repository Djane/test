package com.example;

import io.micronaut.context.annotation.Requires;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.netty.cookies.NettyCookie;
import io.micronaut.session.http.HttpSessionConfiguration;

import javax.inject.Singleton;

@Singleton
@Requires(property = "micronaut.session.http.cookie-name")
public class CookieService {

    private final HttpSessionConfiguration configuration;

    public CookieService(HttpSessionConfiguration configuration) {
        this.configuration = configuration;
    }

    public void createCookie() {
        Cookie cookie = new NettyCookie(configuration.getCookieName(), "this-is-a-test");
        cookie.configure(configuration);
    }
}
