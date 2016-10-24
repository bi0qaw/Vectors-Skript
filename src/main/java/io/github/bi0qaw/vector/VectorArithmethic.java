package io.github.bi0qaw.vector;

import ch.njol.skript.classes.Arithmetic;
import org.bukkit.util.Vector;

public class VectorArithmethic implements Arithmetic<Vector, Vector> {

	public Vector difference(final Vector first, final Vector second) {
		return new Vector(Math.abs(first.getX() - second.getX()), Math.abs(first.getY() - second.getY()), Math.abs(first.getZ() - second.getZ()));
	}

	public Vector add(final Vector first, final Vector second) {
		return new Vector().add(first).add(second);
	}

	public Vector subtract(Vector first, Vector second) {
		return new Vector().add(first).subtract(second);
	}
}
