package com.buba.gmall8080.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 状态码实体类
 */
public class StatusCode {

    public  static  final  int OK=2000; //成功
    public  static  final  int ERROR=2001; //错误
    public  static  final  int LOGINERROR=2002; //账户或密码错误
    public  static  final  int ACCESSERROR=2003; //权限不足
    public  static  final  int REMOTEERROR=2004; //远程调用失败
    public  static  final  int REPERROR=2005; //重复操作

    static   SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static final  String TIME=sdf.format(new Date());
}
