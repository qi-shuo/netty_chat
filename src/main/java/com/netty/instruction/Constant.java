package com.netty.instruction;

import com.netty.domain.Grou;
import com.netty.domain.vo.UserInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author ：冉野
 * @date ：Created in 2019-07-13 18:40
 * @description：常量枚举
 * @modified By：
 * @version: V1.0.0$
 */
public class Constant {


    public static final String USER_TOKEN = "userId";

    public static final Integer THEAD_SIZE = 10;

       public static Map<String, WebSocketServerHandshaker> webSocketHandshakerMap =
            new ConcurrentHashMap<String, WebSocketServerHandshaker>();

    public static Map<String, ChannelHandlerContext> onlineUserMap =
            new ConcurrentHashMap<>();

    public static Map<String, Grou> groupInfoMap =
            new ConcurrentHashMap<String, Grou>();

    public static Map<String, UserInfo> userInfoMap =
            new HashMap<String, UserInfo>();
}
