package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class CookieController {

    private final CookieService cookieService;

    CookieController(final CookieService cookieService) {
        this.cookieService = cookieService;
    }


    @Get
    public void testCookie() {
        cookieService.createCookie();
    }
}
