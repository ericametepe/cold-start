package fr.andriveau.apigen.domain.query;

public interface IQuery<T extends Iterable> {
    T get();
}
