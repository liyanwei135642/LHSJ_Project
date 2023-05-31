package com.uvi.digital.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Company.
 */
@Entity
@Table(name = "company")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "uscc")
    private String uscc;

    @Column(name = "principal")
    private String principal;

    @Column(name = "phone")
    private String phone;

    @Column(name = "settle_time")
    private Instant settleTime;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Company id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public Company name(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUscc() {
        return this.uscc;
    }

    public Company uscc(String uscc) {
        this.setUscc(uscc);
        return this;
    }

    public void setUscc(String uscc) {
        this.uscc = uscc;
    }

    public String getPrincipal() {
        return this.principal;
    }

    public Company principal(String principal) {
        this.setPrincipal(principal);
        return this;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getPhone() {
        return this.phone;
    }

    public Company phone(String phone) {
        this.setPhone(phone);
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Instant getSettleTime() {
        return this.settleTime;
    }

    public Company settleTime(Instant settleTime) {
        this.setSettleTime(settleTime);
        return this;
    }

    public void setSettleTime(Instant settleTime) {
        this.settleTime = settleTime;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Company)) {
            return false;
        }
        return id != null && id.equals(((Company) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Company{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", uscc='" + getUscc() + "'" +
            ", principal='" + getPrincipal() + "'" +
            ", phone='" + getPhone() + "'" +
            ", settleTime='" + getSettleTime() + "'" +
            "}";
    }
}
