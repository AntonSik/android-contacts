package ru.yandex.practicum.contacts.presentation.base;

public interface BaseListDiffInterface<T extends ListDiffInterface<BaseListDiffCallback>> {
    boolean areItemsTheSame(T t);
}
