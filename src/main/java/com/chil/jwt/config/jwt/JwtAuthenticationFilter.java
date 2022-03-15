package com.chil.jwt.config.jwt;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Spring Security has UsernamePasswordAuthenticationFilter
// on POST request with username, password, if this information is delivered
// then, UsernamePasswordAuthenticationFilter is operating.
// within security config, once formlogin disabled, this filter is not operationg.
// to operate this filter. go to SecurityConfig and add this filter
// addFilter(new JWtAuthentication)

@RequiredArgsConstructor
public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private final AuthenticationManager authenticationManager;
// login request, this function is operating once
    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        System.out.println("JwtAuthentication Filter: login trial");
        return super.attemptAuthentication(request, response);
    }
}
