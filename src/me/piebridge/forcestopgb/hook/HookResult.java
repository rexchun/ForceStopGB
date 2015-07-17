package me.piebridge.forcestopgb.hook;

import android.content.IntentFilter;

/**
 * Created by thom on 15/7/12.
 */
public final class HookResult {

    private Class<?> type;
    private Integer result;

    public static final HookResult NONE = new HookResult(Void.class, null);
    public static final HookResult NO_MATCH = new HookResult(int.class, IntentFilter.NO_MATCH_ACTION);

    private HookResult(Class<?> type, Integer result) {
        this.type = type;
        this.result = result;
    }

    public boolean isNone() {
        return Void.class.equals(this.type);
    }

    public Integer getResult() {
        return this.result;
    }

}