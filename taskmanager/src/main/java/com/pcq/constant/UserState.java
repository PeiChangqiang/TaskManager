package com.pcq.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户状态
 */
public class UserState {
        public static final int NORMAL = 0;//正常
        public static final int FORBIDDEN = 1;//禁用
        public static final int LOSE_EFFICACY = -1;//已注销

        public static final Map<Integer, String> USER_STATE = new HashMap<Integer, String>() {
                {
                        put(UserState.NORMAL, "正常");
                        put(UserState.FORBIDDEN, "禁用");
                        put(UserState.LOSE_EFFICACY, "已注销");
                }
        };
}
