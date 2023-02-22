package com.ironmanguide;

import com.ironmanguide.IronmanGuidePlugin;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class IronmanGuideTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(IronmanGuidePlugin.class);
		RuneLite.main(args);
	}
}