package com.sanvalero.orms.Web.Config;

public class SecurityConfig {
    public static final String JWT_COOKIE_NAME = "jwt_cookie";
    public static final String JWT_SECRET = "U(P4WA:q*3s@rxS9#g7PS&jA;*$X/.-(";
    public static final long EXPIRATION_TIME_IN_MILLIS = 900_000; 
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_IN_URL_API = "/api/users/login";
    public static final String SIGN_IN_URL_WEB = "/users/login";
}
