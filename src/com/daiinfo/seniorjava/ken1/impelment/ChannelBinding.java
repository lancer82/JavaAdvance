package com.daiinfo.seniorjava.ken1.impelment;

import java.net.InetAddress;
import java.util.Arrays;
/**
 * 该类的整体性描述。
 *
 * @author 作者
 * @version 1.0, 05/22/07
 * @since 1.0
 */
public class ChannelBinding {
/**
 * 对该变量的备注信息
 */
private InetAddress initiator;
/**
 * 对该变量的备注信息
 */
private InetAddress acceptor;
/**
 * 对该变量的备注信息
 */
    private  byte[] appData;
  
    /**
     * 对该类的构造函数的备注信息。
     *
     * @param initAddr 对参数的备注。
     * @param acceptAddr对参数的备注。
     * @param appData对参数的备注。
     */
    public ChannelBinding(InetAddress initAddr, InetAddress acceptAddr,
              byte[] appData) {
         initiator = initAddr;
         acceptor = acceptAddr;
         if (appData != null) {
              this.appData = new byte[appData.length];
              java.lang.System.arraycopy(appData, 0, this.appData, 0,
                   appData.length);
         }
    }
 
    /**
     * 对该类的具体一函数的备注信息
     *
     * @param obj 参数的备注信息
     * @return 返回值的备注信息
     */
    public boolean equals(Object obj) {
         if (this == obj)
              return true;
         if (! (obj instanceof ChannelBinding))
              return false;
         ChannelBinding cb = (ChannelBinding) obj;
         return Arrays.equals(appData, cb.appData);
    }
}
