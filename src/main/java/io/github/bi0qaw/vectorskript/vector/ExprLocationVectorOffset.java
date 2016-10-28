package io.github.bi0qaw.vectorskript.vector;

import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;
import org.bukkit.Location;
import org.bukkit.event.Event;
import org.bukkit.util.Vector;


public class ExprLocationVectorOffset extends SimpleExpression<Location> {

	private Expression<Location> location;
	private Expression<Vector> vectors;

	@Override
	protected Location[] get(Event event) {
		Location l = location.getSingle(event);
		if (l == null) {
			return null;
		}
		Location clone = l.clone();
		for (Vector v : vectors.getArray(event)) {
			clone.add(v);
		}
		return new Location[] {clone};
	}

	public boolean isSingle() {
		return true;
	}

	public Class<? extends Location> getReturnType() {
		return Location.class;
	}

	public String toString(Event event, boolean b) {
		return location.toString() + " offset by vector " + vectors.toString();
	}

	public boolean init(Expression<?>[] expressions, int i, Kleenean kleenean, SkriptParser.ParseResult parseResult) {
		location = (Expression<Location>) expressions[0];
		vectors = (Expression<Vector>) expressions[1];
		return true;
	}
}
