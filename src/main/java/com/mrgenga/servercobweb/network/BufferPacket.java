package com.mrgenga.servercobweb.network;

import cn.nukkit.raknet.protocol.Packet;

public class BufferPacket extends Packet{

    public BufferPacket(){
    }
    
    public byte getID(){
        return (byte)0xff;
    }
    
}