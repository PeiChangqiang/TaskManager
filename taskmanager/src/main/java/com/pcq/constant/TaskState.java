package com.pcq.constant;

import java.util.HashMap;
import java.util.Map;

public class TaskState {
    public static final int INIT = 0;//新建
    public static final int IN_THE_WAY = 1;//进行中
    public static final int COMPLETE = 2;//已完成
    public static final int CANCEL = -1;//已取消

    public static final Map<Integer, String> TASK_STATE = new HashMap<Integer, String>() {
        {
            put(TaskState.INIT, "新建");
            put(TaskState.IN_THE_WAY, "进行中");
            put(TaskState.COMPLETE, "已完成");
            put(TaskState.CANCEL, "已取消");
        }
    };
}
