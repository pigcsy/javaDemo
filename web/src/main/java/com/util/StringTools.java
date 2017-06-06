package com.util;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * 字符串工具扩展 <br/>
 * 仅满足特殊需求
 *
 * @author 轴承
 * @date 2016/10/22 下午2:57
 */
public abstract class StringTools {

    /**
     * 是否是纯数字字符串
     *
     * @param target 目标字符串
     * @return
     */
    public static boolean isNumberString(String target) {
        String reg = "^\\d+$";
        Pattern pattern = Pattern.compile(reg);
        return pattern.matcher(target).matches();
    }

    /**
     * 验证字符串是否是严格的手机号码<br/>
     * 严格模式
     *
     * @param string 要验证的字符串
     * @return
     */
    public static boolean isMobileStrict(String string) {
        if (StringUtils.isEmpty(string)) {
            return false;
        }
        Pattern pattern = Pattern.compile("^(13[0-9]|15[012356789]|17[01678]|18[0-9]|14[57])[0-9]{8}$"); // 手机号
        return pattern.matcher(string).matches();
    }

    /**
     * 验证字符串是否是手机号码<br/>
     * 非严格,基本就验证是1开头的11为数字
     *
     * @param string 字符串
     * @return
     */
    public static boolean isMobile(String string) {
        if (StringUtils.isEmpty(string)) return false;
        Pattern p = Pattern.compile("^([1][0-9]{10})$");
        return p.matcher(string).matches();
    }

    /**
     * 处理区域字符串<br/>
     * 清除掉区域字符串中的省市字段
     *
     * @param region
     * @return
     */
    public static String dealRegionStr(String region) {
        if (StringUtils.isBlank(region))
            return null;
        return region.trim().replaceAll("[省|市]", "");
    }

    /**
     * 拼接字符串,如果字符串是空的,则跳过
     *
     * @param args
     * @return
     */
    public static String concat(CharSequence... args) {
        StringBuffer sb = new StringBuffer();
        if (args == null || args.length == 0)
            return sb.toString().trim();
        Stream.of(args).forEach(target -> {
            if (target != null)
                sb.append(target);
        });
        return sb.toString().trim();
    }
}
