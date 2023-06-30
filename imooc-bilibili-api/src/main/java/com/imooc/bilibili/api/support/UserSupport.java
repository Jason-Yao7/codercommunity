package com.imooc.bilibili.api.support;

import com.imooc.bilibili.domain.exception.ConditionException;
import com.imooc.bilibili.util.TokenUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author Shangchen Yao
 * @date 2023/6/4 15:46
 */
@Component
public class UserSupport {

    public Long getCurrentUserId() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        String token = requestAttributes.getRequest().getHeader("token");
        Long userId = TokenUtil.verifyToken(token);
        if (userId < 0) {
            throw new ConditionException("非法用户");
        }
        return userId;

    }
}
