package com.dower.sharerideapp.core.shiro;

import com.dower.sharerideapp.core.repository.ShiroSampleDao;
import com.dower.sharerideapp.core.repository.admin.AdminExtDao;
import com.dower.sharerideapp.service.admin.MemberExtService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by wangwei on 2020/7/6.
 */
public class CustomRealm extends AuthorizingRealm {
    @Autowired
    private ShiroSampleDao shiroSampleDao;
    @Autowired
    private AdminExtDao adminExtDao;
    /**
     * 认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        //String password = this.shiroSampleDao.getPasswordByUsername(username);
        Map param = new HashMap();
        param.put("VC_LOGIN_NAME",username);
        String passwordByUsername = adminExtDao.getPasswordByUsername(param);
       // adminExtDao.queryUserList();
        return new SimpleAuthenticationInfo(username, passwordByUsername, getName());
    }

    /**
     * 授权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = (String) super.getAvailablePrincipal(principalCollection);
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        Set<String> roles = shiroSampleDao.getRolesByUsername(username);
        authorizationInfo.setRoles(roles);
        roles.forEach(role -> {
            Set<String> permissions = this.shiroSampleDao.getPermissionsByRole(role);
            authorizationInfo.addStringPermissions(permissions);
        });
        return authorizationInfo;
    }
}
