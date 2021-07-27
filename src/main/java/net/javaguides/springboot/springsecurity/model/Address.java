package net.javaguides.springboot.springsecurity.model;


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Amit Chaulagain on 12/08/2020
 * @version 1.0
 * A class to represent a [[Address]]
 *
 *
 */
@Embeddable
public class Address {

    @Column(name = "street")
    private String street;

    @Column(name = "town")
    private String town;

    @Column(name = "province")
    private String province;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "country")
    private String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}