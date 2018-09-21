package com.pcq.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 任务难度，数字越大，难度级别越高
 */
public class TaskDifficult {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;


    public static final Map<Integer, String> TASK_DIFFICULT = new HashMap<Integer, String>() {
        {
            put(TaskDifficult.ZERO, "容易");
            put(TaskDifficult.ONE, "简单");
            put(TaskDifficult.TWO, "一般");
            put(TaskDifficult.THREE, "困难");
            put(TaskDifficult.FOUR, "修罗");
        }
    };
}
