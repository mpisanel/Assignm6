package com.pharmacy_domain_driven.factory.Pharmacy;
import com.pharmacy_domain_driven.domain.Pharmacy.Impl.PharmacyAddressImpl;
/**
 * Created by SONY on 2016-04-16.
 */
public class PharmacyAddressFactory
{
    public static PharmacyAddressImpl getPatientAddress(String pharmStreet, String pharmSuburb, String pharmPostCode)
    {
        PharmacyAddressImpl myParmAddress = new PharmacyAddressImpl.Builder(pharmStreet)
                .bSuburb(pharmSuburb)
                .bPostCode(pharmPostCode)
                .build();
        return myParmAddress;
    }
}
