package com.pharmacy_domain_driven.domain.Doctor.Impl;

import com.pharmacy_domain_driven.domain.Doctor.Doctor;

/**
 * Created by SONY on 2016-04-15.
 */
public class DoctorImp implements Doctor
{
    private String doctorID;
    private String doctorName;

    @Override
    public String getDoctorID()
    {
        return doctorID;
    }
    public String getDoctorName()
    {
        return doctorName;
    }

    public static class Builder
    {
        private String doctorID;
        private String doctorName;

        public Builder(String doctorID)
        {
            this.doctorID = doctorID;
        }
        public Builder bDocName(String doctorName)
        {
            this.doctorName = doctorName;
            return this;
        }
        public Builder copy(DoctorImp doc)
        {
            this.doctorID = doc.getDoctorID();
            this.doctorName = doc.getDoctorName();
            return this;
        }
        public DoctorImp build()
        {
            return new DoctorImp(this);
        }
    }

    public DoctorImp(Builder build)
    {
        doctorID = build.doctorID;
        doctorName = build.doctorName;
    }
}
