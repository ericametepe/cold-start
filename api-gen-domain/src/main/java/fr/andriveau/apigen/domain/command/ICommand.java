package fr.andriveau.apigen.domain.command;

public interface ICommand<T> {
    void execute(T commandRequest);
}
