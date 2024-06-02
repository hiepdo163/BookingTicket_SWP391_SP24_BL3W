package com.hollywood.fptu_cinema.enums;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum RoleEnum {
    ADMIN,
    MEMBER,
    STAFF;

    public GrantedAuthority asGrantedAuthority() {
        return new SimpleGrantedAuthority(this.name());
    }
}
