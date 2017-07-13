package co.zw.arfel.clothing.model;

import javax.persistence.MappedSuperclass;
import java.util.Objects;

/**
 * Created by ezinzombe on 7/13/17.
 */
@MappedSuperclass
public class BaseEntityName extends BaseEntityId{

    private String name;
    private String description;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof BaseEntityName)) {
            return false;
        }
        BaseEntityName other = (BaseEntityName) o;
        return Objects.equals(name, other.name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

