package fr.innog.network.utils;

import io.netty.buffer.ByteBuf;

public interface INetworkCustomizedDeserialization<T> extends INetworkElement {

    public T getDeserializationInstance();

}
