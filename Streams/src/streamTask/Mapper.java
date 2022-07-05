package streamTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface Mapper {
    static List<Target> mapSourceToTarget(List<Source> sourceList)
    {
        List<Target> targetList = new ArrayList<>();


        Map<String,List<Source>> thirdMap = sourceList.stream().collect(Collectors.groupingBy(Source::getTypeAndSomeId));
        System.out.println(thirdMap);
        int i = 0;
        for (String key:thirdMap.keySet()
        ) {
            targetList.add(new Target(thirdMap.get(key).get(0).getType(), thirdMap.get(key).get(0).getSomeId()));
            for (Source source:thirdMap.get(key)
            ) {
                targetList.get(i).addIdentifier(source.getIdentifier());
            }
        i++;
        }
        return targetList;
    }
}
