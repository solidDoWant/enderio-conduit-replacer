package com.soliddowant.enderioconduitreplacer.network;

import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class PacketHandler {

    // Vanilla custom payload packets cap channel names at 20 chars; the mod ID is too long.
    public static final String CHANNEL = "eio-conduit-replacer";

    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(CHANNEL);

    private static int id = 0;

    public static void init() {
        INSTANCE.registerMessage(PacketSetGhostSlot.Handler.class, PacketSetGhostSlot.class, id++, Side.SERVER);
    }
}
