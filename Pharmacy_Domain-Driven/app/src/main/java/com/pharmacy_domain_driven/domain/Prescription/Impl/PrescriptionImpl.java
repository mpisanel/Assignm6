package com.pharmacy_domain_driven.domain.Prescription.Impl;

import com.pharmacy_domain_driven.domain.Prescription.Prescription;

/**
 * Created by SONY on 2016-04-16.
 */
public class PrescriptionImpl implements Prescription
{
    private String preID;
    private String preDate;

    public PrescriptionImpl(Builder builder)
    {
        preID = builder.preID;
        preDate = builder.preDate;
    }

    public String getPrescriptionID()
    {
        return  preID;
    }
    public String getPrescriptionDate()
    {
        return preDate;
    }

    public static class Builder
    {
        private String preID;
        private String preDate;

        public Builder (String preID)
        {
            this.preID = preID;
        }
        public Builder bPrescriptionDate(String preDate)
        {
            this.preDate = preDate;
            return this;
        }

        public  Builder copy(PrescriptionImpl pre)
        {
            this.preID = pre.getPrescriptionID();
            this.preDate = pre.getPrescriptionDate();
            return this;
        }

        public PrescriptionImpl build()
        {
            return new PrescriptionImpl(this);
        }
    }
}
