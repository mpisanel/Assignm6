package com.pharmacy_domain_driven.domain.Pharmacy.Impl;

import com.pharmacy_domain_driven.domain.Pharmacy.PharmacyAddress;

/**
 * Created by SONY on 2016-04-16.
 */
public class PharmacyAddressImpl implements PharmacyAddress
{
    private String street;
    private String suburb;
    private String postCode;

    public String getPostCode()
    {
        return postCode;
    }
    public String getSuburb()
    {
        return suburb;
    }
    public String getStreet()
    {
        return street;
    }

    public static class Builder
    {
        private String street;
        private String suburb;
        private String postCode;

        public Builder(String street)
        {
            this.street = street;
        }
        public Builder bSuburb(String suburb)
        {
            this.suburb = suburb;
            return this;
        }
        public Builder bPostCode(String postCode)
        {
            this.postCode = postCode;
            return this;
        }

        public Builder copy(PharmacyAddressImpl parmAddress)
        {
            this.street = parmAddress.getStreet();
            this.suburb = parmAddress.getSuburb();
            this.postCode = parmAddress.getPostCode();
            return this;
        }
        public PharmacyAddressImpl build()
        {
            return  new PharmacyAddressImpl(this);
        }
    }
    public PharmacyAddressImpl(Builder build)
    {
        street = build.street;
        suburb = build.suburb;
        postCode = build.postCode;
    }
}
