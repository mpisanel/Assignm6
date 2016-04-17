package com.pharmacy_domain_driven.domain.AlternativeContact.Impl;

import com.pharmacy_domain_driven.domain.AlternativeContact.AlternativeContactAddress;

/**
 * Created by SONY on 2016-04-16.
 */
public class AlternativeContactAddressImpl implements AlternativeContactAddress
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

        public Builder copy(AlternativeContactAddressImpl patAddress)
        {
            this.street = patAddress.getStreet();
            this.suburb = patAddress.getSuburb();
            this.postCode = patAddress.getPostCode();
            return this;
        }
        public AlternativeContactAddressImpl build()
        {
            return  new AlternativeContactAddressImpl(this);
        }
    }
    public AlternativeContactAddressImpl(Builder build)
    {
        street = build.street;
        suburb = build.suburb;
        postCode = build.postCode;
    }

}
