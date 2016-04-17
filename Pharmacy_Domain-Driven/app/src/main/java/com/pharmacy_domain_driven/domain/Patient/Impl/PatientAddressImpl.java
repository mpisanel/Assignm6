package com.pharmacy_domain_driven.domain.Patient.Impl;

import android.app.Notification;

import com.pharmacy_domain_driven.domain.Patient.PatientAddress;

/**
 * Created by SONY on 2016-04-16.
 */
public class PatientAddressImpl implements PatientAddress
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

        public Builder copy(PatientAddressImpl patAddress)
        {
            this.street = patAddress.getStreet();
            this.suburb = patAddress.getSuburb();
            this.postCode = patAddress.getPostCode();
            return this;
        }
        public PatientAddressImpl build()
        {
            return  new PatientAddressImpl(this);
        }
    }
    public PatientAddressImpl(Builder build)
    {
        street = build.street;
        suburb = build.suburb;
        postCode = build.postCode;
    }
}
