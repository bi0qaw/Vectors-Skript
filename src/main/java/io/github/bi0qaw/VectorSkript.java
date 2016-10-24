
package io.github.bi0qaw;

import ch.njol.skript.Skript;
import io.github.bi0qaw.vector.VectorRegister;
import io.github.bi0qaw.vector.VectorType;
import org.bukkit.plugin.java.JavaPlugin;

public class VectorSkript extends JavaPlugin {

	private static VectorSkript plugin;
	@Override
	public void onEnable() {
		plugin = this;
		Skript.registerAddon(this);
		new VectorRegister();
		new VectorType();
	}

	public static VectorSkript getPlugin() {
		return plugin;
	}
}
