package com.pharmacy_domain_driven.domain.Pharmacy.Impl;

import com.pharmacy_domain_driven.domain.Pharmacy.Pharmacy;

/**
 * Created by SONY on 2016-04-16.
 */
public class PharmacyImpl implements Pharmacy
{
    private String pharmacyID;
    private String pharmacyName;

    public String getPharmacyID()
    {
        return pharmacyID;
    }
    public String getPharmacyName()
    {
        return pharmacyName;
    }

    public static class Builder
    {
        private String pharmacyID;
        private String pharmacyName;

        public Builder(String pharmacyID)
        {
            this.pharmacyID = pharmacyID;
        }
        public Builder bPharmName(String pharmacyName)
        {
            this.pharmacyName = pharmacyName;
            return this;
        }

        public Builder copy(PharmacyImpl pharm)
        {
            this.pharmacyID = pharm.getPharmacyID();
            this.pharmacyName = pharm.getPharmacyName();
            return this;
        }
        public PharmacyImpl build()
        {
            return new PharmacyImpl(this);
        }
    }

    public PharmacyImpl(Builder build)
    {
        pharmacyID = build.pharmacyID;
        pharmacyName = build.pharmacyName;
    }

}
