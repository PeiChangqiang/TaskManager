package com.pcq.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户类型
 */
public class UserType {
    public static final int ADMIN = 0;//管理员
    public static final int CLIENT = 1;//普通用户

    public static final Map<Integer, String> USER_TYPE = new HashMap<Integer, String>() {
        {
            put(UserType.ADMIN, "管理员");
            put(UserType.CLIENT, "普通用户");
        }
    };
}
