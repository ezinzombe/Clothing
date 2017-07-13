package co.zw.arfel.clothing.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by ezinzombe on 7/13/17.
 */
@Entity
@Table(name = "order")
public class Order extends  BaseEntityId {

    private Advert advert;



    @ManyToOne
    public Advert getAdvert() {
        return advert;
    }

    public void setAdvert(Advert advert) {
        this.advert = advert;
    }
}
