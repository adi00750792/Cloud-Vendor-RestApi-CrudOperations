package com.cloudVendor.api.model;

import jakarta.persistence.*;


@Entity
@Table(name = "Cloud_Vendor_Table")
public class CloudVendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Vendor_ID", nullable = false)
    private long vendorId;
    @Column(name = "Vendor_Name")
    private String vendorName;
    @Column(name = "Vendor_Address")
    private String vendorAddress;
    @Column(name = "Phone_Number")
    private int phoneNumber;

    public long getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
