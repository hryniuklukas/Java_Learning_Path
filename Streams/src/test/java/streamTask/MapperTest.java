package streamTask;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MapperTest {
    @Test
    void mapSourceToTarget() {
        List<Source> sourceList = new ArrayList<>();
        sourceList.add(new Source("type1", 3, "iden1"));
        sourceList.add(new Source("type1", 3, "iden2"));
        sourceList.add(new Source("type2", 3, "iden3"));
        sourceList.add(new Source("type1", 4, "iden4"));
        sourceList.add(new Source("type1", 4, "iden5"));
        sourceList.add(new Source("type2", 3, "iden6"));
        sourceList.add(new Source("type1", 3, "iden7"));
        sourceList.add(new Source("type3", 3, "iden8"));

        List<Target> actualTarget = Mapper.mapSourceToTarget(sourceList);
        List<Target> expectedTarget = new ArrayList<>();
        expectedTarget.add(new Target("type1", 4, List.of("iden4", "iden5")));
        expectedTarget.add(new Target("type1", 3, List.of("iden1", "iden2", "iden7")));
        expectedTarget.add(new Target("type2", 3, List.of("iden3", "iden6")));
        expectedTarget.add(new Target("type3", 3, List.of("iden8")));
        assertThat(actualTarget).hasSameElementsAs(expectedTarget);
    }

}