module standalone.jpa {
    requires jakarta.persistence;
    requires org.hibernate.orm.core;

    opens xyz.ronella.template.jpa to org.hibernate.orm.core;
    opens xyz.ronella.template.jpa.model to org.hibernate.orm.core;
}