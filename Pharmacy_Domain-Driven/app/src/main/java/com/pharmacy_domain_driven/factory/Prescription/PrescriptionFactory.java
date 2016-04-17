package com.pharmacy_domain_driven.factory.Prescription;
import com.pharmacy_domain_driven.domain.Prescription.Impl.PrescriptionImpl;

/**
 * Created by SONY on 2016-04-16.
 */
public class PrescriptionFactory
{
    public static PrescriptionImpl getPrescription(String preID, String preDate)
    {
        PrescriptionImpl myPres = new PrescriptionImpl.Builder(preID)
                .bPrescriptionDate(preDate)
                .build();
        return myPres;
    }
}
