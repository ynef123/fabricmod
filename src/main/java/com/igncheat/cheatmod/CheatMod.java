package com.igncheat.cheatmod;

import net.fabricmc.api.ClientModInitializer;

public class CheatMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("CheatMod Loaded!");
    }
}
