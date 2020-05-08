package jdbc.onetomany;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public class Child {
    @Id
    private Long id;
    @Column("child_name")
    private String name;

    protected Child() { }

    public Child(String name) {
        this.name = name;
    }
}
