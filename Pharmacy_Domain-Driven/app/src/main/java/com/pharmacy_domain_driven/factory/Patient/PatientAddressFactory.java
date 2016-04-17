package com.pharmacy_domain_driven.factory.Patient;
import com.pharmacy_domain_driven.domain.Patient.Impl.PatientAddressImpl;
/**
 * Created by SONY on 2016-04-16.
 */
public class PatientAddressFactory
{
    public static PatientAddressImpl getPatientAddress(String pStreet, String pSuburb, String pPostCode)
    {
        PatientAddressImpl myPatAddress = new PatientAddressImpl.Builder(pStreet)
                .bSuburb(pSuburb)
                .bPostCode(pPostCode)
                .build();
        return myPatAddress;
    }
}
