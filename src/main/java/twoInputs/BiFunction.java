package twoInputs;

@FunctionalInterface
public interface BiFunction<T, U, V> {

	V f(T t, U u);
}
