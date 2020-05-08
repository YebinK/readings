package jdbc.onetomany;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.util.Set;

public class Parent {
    @Id
    private Long id;
    @Column("parent_name")
    private String name;
    private Set<Child> children;

    protected Parent() { }

    public Parent(String name, Set<Child> children) {
        this.name = name;
        this.children = children;
    }

    public void addChild(Child child) {
        children.add(child);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Child> getChildren() {
        return children;
    }
}
