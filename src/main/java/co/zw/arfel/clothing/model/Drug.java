package co.zw.arfel.clothing.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by ezinzombe on 7/12/17.
 */
@Entity
@Table(name = "drug")
public class Drug {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pharmacyId;
    @Column(name = "pharmacyName")
    @NotEmpty(message = "*Please provide pharmacy name")
    private String pharmacyName;
    @Column(name = "drugName")
    @NotEmpty(message = "*Please provide drug name")
    private String drugName;
    @Column(name = "drugClass")
    @NotEmpty(message = "*Please provide drug class")
    private String drugClass;
    @Column(name = "formulation")
    @NotEmpty(message = "*Please provide formulation")
    private String formulation;
    @Column(name = "tradeName")
    @NotEmpty(message = "*Please provide your Trade Name")
    private String tradeName;
    @Column(name = "coordinates")
    @NotEmpty(message = "*Please provide pharmacy coordinates")
    private String coordinates;
    private String physicalAddress;
    private String phoneNumber;
    private String drugStatus;
    private Boolean registered;

    public String getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(String pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugClass() {
        return drugClass;
    }

    public void setDrugClass(String drugClass) {
        this.drugClass = drugClass;
    }

    public String getFormulation() {
        return formulation;
    }

    public void setFormulation(String formulation) {
        this.formulation = formulation;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDrugStatus() {
        return drugStatus;
    }

    public void setDrugStatus(String drugStatus) {
        this.drugStatus = drugStatus;
    }

    public Boolean getRegistered() {
        return registered;
    }

    public void setRegistered(Boolean registered) {
        this.registered = registered;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @Transient
    public boolean isNew() {
        return (getId() == null);
    }
}
