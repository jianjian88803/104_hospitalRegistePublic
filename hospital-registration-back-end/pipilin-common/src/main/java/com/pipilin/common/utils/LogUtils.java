package com.pipilin.common.utils;

/**
 * 处理并记录日志文件
 * 
 * @author  1556708905@qq.com
 */
public class LogUtils
{
    public static String getBlock(Object msg)
    {
        if (msg == null)
        {
            msg = "";
        }
        return "[" + msg.toString() + "]";
    }
}
