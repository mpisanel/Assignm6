package com.pharmacy_domain_driven.factory.Doctor;
import com.pharmacy_domain_driven.domain.Doctor.Impl.DoctorAddressImpl;
/**
 * Created by SONY on 2016-04-16.
 */
public class DoctorAddressFactory
{
    public static DoctorAddressImpl getDoctorAddress(String dStreet, String dSuburb, String dPostCode)
    {
        DoctorAddressImpl myDocAddress = new DoctorAddressImpl.Builder(dStreet)
                .bSuburb(dSuburb)
                .bPostCode(dPostCode)
                .build();
        return myDocAddress;
    }
}
