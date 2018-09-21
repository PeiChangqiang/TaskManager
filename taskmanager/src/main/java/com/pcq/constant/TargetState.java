package com.pcq.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 目标状态
 */
public class TargetState {
    public static final int INIT = 0; //新建
    public static final int COMPLETE = 1;//已完成
    public static final int IN_THE_WAY = 2;//进行中
    public static final int CANCEL = -1;//已取消

    public static final Map<Integer, String> TARGET_STATE = new HashMap<Integer, String>() {
        {
            put(TargetState.INIT, "新建");
            put(TargetState.COMPLETE, "已完成");
            put(TargetState.IN_THE_WAY, "进行中");
            put(TargetState.CANCEL, "已取消");
        }
    };
}
