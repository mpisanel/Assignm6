package com.pharmacy_domain_driven.factory.Patient;
import com.pharmacy_domain_driven.domain.Patient.Impl.PatientImpl;
/**
 * Created by SONY on 2016-04-15.
 */
public class PatientFactory
{
    public static PatientImpl getPatient(String pID, String pName, String mID, String mName )
    {
        PatientImpl myPat = new PatientImpl.Builder(pID)
                .bPatName(pName)
                .bMedID(mID)
                .bPatName(mName)
                .build();
        return myPat;
    }
}
