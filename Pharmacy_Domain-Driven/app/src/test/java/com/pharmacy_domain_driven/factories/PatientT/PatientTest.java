package com.pharmacy_domain_driven.factories.PatientT;
import com.pharmacy_domain_driven.domain.Patient.Impl.PatientImpl;
import com.pharmacy_domain_driven.factory.Patient.PatientFactory;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by SONY on 2016-04-16.
 */
public class PatientTest extends TestCase
{
    PatientImpl pati;

    @Override
    public void setUp() throws Exception
    {
        pati = PatientFactory.getPatient("PAT52", "Lulu", "MED9", "Venzi");
    }
    public void testPatient() throws Exception
    {
        Assert.assertEquals("MED9", pati.getMedicalID());
    }

    public void testUpdate() throws Exception
    {
        PatientImpl patUpdate = new PatientImpl.Builder(pati.getPatientID())
                .copy(pati)
                .bPatName("Zulu")
                .build();

        Assert.assertNotNull(patUpdate);
        Assert.assertEquals(patUpdate.getPatientName(),"Zulu");
    }
}
