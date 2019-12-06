package com.ihandy.distribution.utils.weichat;

import lombok.Data;

/**
 * Created by wangwei on 2019/9/25.
 */
@Data
public class Message {
    private String ToUserName;

    private String FromUserName;

    private Long CreateTime;

    private String MsgType;

    private String Content;

    private String MsgId;
}
