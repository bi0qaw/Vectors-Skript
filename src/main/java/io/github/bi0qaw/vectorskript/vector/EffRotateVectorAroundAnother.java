package io.github.bi0qaw.vectorskript.vector;

import ch.njol.skript.lang.Effect;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.util.Kleenean;
import org.bukkit.event.Event;
import org.bukkit.util.Vector;

public class EffRotateVectorAroundAnother extends Effect{

	private Expression<Vector> first;
	private Expression<Vector> second;
	private Expression<Number> number;

	public String toString(Event event, boolean b) {
		return "rotate " + first.toString() + " around " + second.toString();
	}

	public boolean init(Expression<?>[] expressions, int i, Kleenean kleenean, SkriptParser.ParseResult parseResult) {
		first = (Expression<Vector>)expressions[0];
		second = (Expression<Vector>)expressions[1];
		number = (Expression<Number>)expressions[2];
		return true;
	}

	@Override
	protected void execute(Event event) {
		Vector v2 = second.getSingle(event);
		Number n = number.getSingle(event);
		if (v2 == null || n == null ){
			return;
		}
		for (Vector v1 : first.getArray(event)) {
			VectorMath.rot(v1, v2, n.doubleValue());
		}
	}


}
