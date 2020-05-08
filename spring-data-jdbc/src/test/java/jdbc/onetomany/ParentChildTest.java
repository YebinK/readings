package jdbc.onetomany;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ParentChildTest {
    @Autowired
    private ParentRepository parentRepository;

    @DisplayName("부모 객체로 자식 가져오기")
    @Test
    void name() {
        Child child1 = new Child("1번 아기");
        Child child2 = new Child("2번 아기");

        Parent parent = new Parent("부모", new HashSet<Child>());

        parent.addChild(child1);
        parent.addChild(child2);

        Parent persistParent = parentRepository.save(parent);
        Parent foundParent = parentRepository.findById(persistParent.getId())
                .orElseThrow(RuntimeException::new);

        assertThat(foundParent.getChildren().size()).isEqualTo(2);
   }
}