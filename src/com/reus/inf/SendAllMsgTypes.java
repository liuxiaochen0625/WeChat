/**
 * 微信公众平台开发模式(JAVA) SDK
 */
package com.reus.inf;

/**
 * 消息类型
 *
 */
public enum SendAllMsgTypes {
    TEXT("text"),
    IMAGE("image"),
    VOICE("voice"),
    MPVIDEO("mpvideo"),
    MPNEWS("mpnews"),
    VIDEO("video");

    private String type;

    SendAllMsgTypes(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
