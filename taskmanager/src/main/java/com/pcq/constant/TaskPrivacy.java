package com.pcq.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 任务隐私性
 */
public class TaskPrivacy {
    public static final int OPEN = 0;//对外可见
    public static final int CLOSE = 1;//对外隐藏

    public static final Map<Integer, String> TASK_PRIVACY = new HashMap<Integer, String>() {
        {
            put(TaskPrivacy.OPEN, "对外可见");
            put(TaskPrivacy.CLOSE, "对外隐藏");
        }
    };
}
