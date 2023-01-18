package com.directi.training.dip.exercise_solution;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase implements DatabaseService
{
    private static Map<Integer, String> _data = new HashMap<>();
    private static int _count = 0;

    public int write(String inputString)
    {
        _data.put(++_count, inputString);
        return _count;
    }
}
