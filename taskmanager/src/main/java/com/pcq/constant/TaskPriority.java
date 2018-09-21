package com.pcq.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 任务优先级
 */
public class TaskPriority {
    public static final int LOW = 0;//低
    public static final int MIDDLE = 1;//中
    public static final int HIGH = 2;//高


    public static final Map<Integer, String> TASK_PRIORITY = new HashMap<Integer, String>(){
        {
            put(TaskPriority.LOW, "低");
            put(TaskPriority.MIDDLE, "中");
            put(TaskPriority.HIGH, "高");
        }
    };
}
