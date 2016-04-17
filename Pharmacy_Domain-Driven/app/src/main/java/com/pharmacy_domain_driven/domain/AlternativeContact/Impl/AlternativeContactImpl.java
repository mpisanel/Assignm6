package com.pharmacy_domain_driven.domain.AlternativeContact.Impl;

import com.pharmacy_domain_driven.domain.AlternativeContact.AlternativeContact;

/**
 * Created by SONY on 2016-04-16.
 */
public class AlternativeContactImpl implements AlternativeContact
{
    private String alternNumber;
    private String alternName;

    public String getAlternativeContactNumber()
    {
        return alternNumber;
    }
    public String getAlternName()
    {
        return alternName;
    }

    public static class Builder
    {
        private String alternNumber;
        private String alternName;

        public Builder(String alternNumber)
        {
            this.alternNumber = alternNumber;
        }
        public Builder bAlternName(String alternName)
        {
            this.alternName = alternName;
            return this;
        }

        public Builder copy(AlternativeContactImpl altern)
        {
            this.alternNumber = altern.getAlternativeContactNumber();
            this.alternName = altern.getAlternName();
            return this;
        }
        public AlternativeContactImpl build()
        {
            return new AlternativeContactImpl(this);
        }
    }
    public AlternativeContactImpl(Builder build)
    {
        alternNumber = build.alternNumber;
        alternName = build.alternName;
    }
}
