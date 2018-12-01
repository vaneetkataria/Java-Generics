package com.katariasoft.technologies.generics.types;

import java.util.function.Function;

@FunctionalInterface
public interface TriFunction<T, U, V, R> {

	R apply(T t, U u, V v);

	default <O> TriFunction<T, U, V, O> andThen(Function<? super R, ? extends O> subsequentFunction) {
		return (t, u, v) -> subsequentFunction.apply(this.apply(t, u, v));
	}

}
