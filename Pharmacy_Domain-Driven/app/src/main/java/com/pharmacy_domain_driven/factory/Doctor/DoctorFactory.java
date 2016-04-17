package com.pharmacy_domain_driven.factory.Doctor;
import com.pharmacy_domain_driven.domain.Doctor.Impl.DoctorImp;
/**
 * Created by SONY on 2016-04-15.
 */
public class DoctorFactory
{
    public static DoctorImp getDoctor(String docID, String docName)
    {
        DoctorImp myDoc = new DoctorImp.Builder(docID)
                .bDocName(docName)
                .build();
        return myDoc;
    }
}
