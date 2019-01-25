package br.com.riachuelo.poc.model;

import lombok.Data;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Audited
@Entity
@Table
@AuditTable(value = "car_audit")
@Data
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "year_model")
    private Integer yearModel;

    @Column(name = "year_fabrication")
    private String yearFabrication;

    @Column
    private String brand;

    @Column
    private String model;

    @Column
    private Integer power;

}
