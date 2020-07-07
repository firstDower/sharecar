package com.dower.sharerideapp.core.repository;

import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangwei on 2020/7/6.
 */
@Repository
public class ShiroSampleDao {
    public Set<String> getRolesByUsername(String username) {
        Set<String> roles = new HashSet<>();
        switch (username) {
            case "zhangsan":
                roles.add("adminP");
                break;
            case "lisi":
                roles.add("guest");
                break;
        }
        return roles;
    }

    public Set<String> getPermissionsByRole(String role) {
        Set<String> permissions = new HashSet<>();
        switch (role) {
            case "adminP":
                permissions.add("read");
                permissions.add("write");
                break;
            case "guest":
                permissions.add("read");
                break;
        }
        return permissions;
    }

    public String getPasswordByUsername(String username) {
        switch (username) {
            case "zhangsan":
                return "zhangsan";
            case "lisi":
                return "lisi";
        }
        return null;
    }
}
