package com.example.georgi.movieapp.parsers.base;

import java.util.List;

public interface JsonParser<T> {

    List<T> fromJsonArray(String jsonString);

    T fromJson(String jsonString);

    String toJson(T object);
}
