package com.pharmacy_domain_driven.domain.Doctor.Impl;

import com.pharmacy_domain_driven.domain.Doctor.DoctorAddress;

/**
 * Created by SONY on 2016-04-16.
 */
public class DoctorAddressImpl implements DoctorAddress
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

        public Builder copy(DoctorAddressImpl docAddress)
        {
            this.street = docAddress.getStreet();
            this.suburb = docAddress.getSuburb();
            this.postCode = docAddress.getPostCode();
            return this;
        }
        public DoctorAddressImpl build()
        {
            return  new DoctorAddressImpl(this);
        }
    }
    public DoctorAddressImpl(Builder build)
    {
        street = build.street;
        suburb = build.suburb;
        postCode = build.postCode;
    }
}
