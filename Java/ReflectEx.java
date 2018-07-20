package com.seven.simpleandroid.extensions;

import android.support.annotation.NonNull;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectEx {
    public static <T> void setField(T obj, @NonNull String field, Object value) throws NoSuchFieldException, IllegalAccessException {
        Class mClass = obj.getClass();
        Field mFiled = mClass.getDeclaredField(field);
        mFiled.setAccessible(true);
        mFiled.set(obj, value);
    }

    public static <T, V> V getField(T obj, @NonNull String field) throws NoSuchFieldException, IllegalAccessException {
        Class mClass = obj.getClass();
        Field mFiled = mClass.getDeclaredField(field);
        mFiled.setAccessible(true);
        return (V) mFiled.get(obj);
    }
}
