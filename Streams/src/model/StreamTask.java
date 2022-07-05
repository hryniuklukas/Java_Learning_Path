package model;
import streamTask.Source;
import streamTask.Target;
import streamTask.Mapper;

import java.util.ArrayList;
import java.util.List;

/* Task:
        [{"type": "type1", "someId": 3, "identifier":"iden1"},
        {"type": "type1", "someId": 3, "identifier":"iden2"},
        {"type": "type2", "someId": 3, "identifier":"iden3"},
        {"type": "type1", "someId": 4, "identifier":"iden4"},
        {"type": "type1", "someId": 4, "identifier":"iden5"},
        {"type": "type2", "someId": 3, "identifier":"iden6"},
        {"type": "type1", "someId": 3, "identifier":"iden7"},
        {"type": "type3", "someId": 3, "identifier":"iden8"}]

        Map list of Source to list of Target (create a method that takes as an argument list of Source objects and returns List of Target objects)

        [{"type": "type1", "someId": 3, "identifiers":["iden1","iden2", "iden7"]},
        {"type": "type2", "someId": 3, "identifiers":["iden3","iden6"]},
        {"type": "type1", "someId": 4, "identifiers":["iden4","iden5"]},
        {"type": "type3", "someId": 3, "identifiers":["iden8"]}]*/

public class StreamTask {
    public static void main(String[] args)
    {
        List<Source> sourceList = new ArrayList<>();
        sourceList.add(new Source("type1", 3, "iden1"));
        sourceList.add(new Source("type1", 3, "iden2"));
        sourceList.add(new Source("type2", 3, "iden3"));
        sourceList.add(new Source("type1", 4, "iden4"));
        sourceList.add(new Source("type1", 4, "iden5"));
        sourceList.add(new Source("type2", 3, "iden6"));
        sourceList.add(new Source("type1", 3, "iden7"));
        sourceList.add(new Source("type3", 3, "iden8"));
        List<Target> targetList = Mapper.mapSourceToTarget(sourceList);
        System.out.println(targetList);

    }
}
