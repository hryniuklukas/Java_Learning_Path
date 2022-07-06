package streamTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Mapper {
    public static List<Target> mapSourceToTarget(List<Source> sourceList) {
        List<Target> targetList = new ArrayList<>();

        sourceList.stream().collect(Collectors.groupingBy(Source::getTypeAndSomeId)).forEach((key, value) -> {
            Target buffer = new Target(value.get(0).getType(), value.get(0).getSomeId());
            value.forEach(s -> buffer.addIdentifier(s.getIdentifier()));
            targetList.add(buffer);
        });

        return targetList;
    }
}
