package com.pharmacy_domain_driven.factory.Pharmacy;
import com.pharmacy_domain_driven.domain.Pharmacy.Impl.PharmacyImpl;
/**
 * Created by SONY on 2016-04-16.
 */
public class PharmacyFactory
{
    public static PharmacyImpl getPharmacy(String pharmID, String pharmName)
    {
        PharmacyImpl myPharm = new PharmacyImpl.Builder(pharmID)
                .bPharmName(pharmName)
                .build();
        return myPharm;
    }
}
