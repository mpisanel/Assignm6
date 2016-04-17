package com.pharmacy_domain_driven.factories.PrescriptionT;
import com.pharmacy_domain_driven.domain.Prescription.Impl.PrescriptionImpl;
import com.pharmacy_domain_driven.factory.Prescription.PrescriptionFactory;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by SONY on 2016-04-16.
 */
public class PrescriptionTest extends TestCase
{
    PrescriptionImpl presc;

    @Override
    public void setUp() throws Exception {
        presc = PrescriptionFactory.getPrescription("PR3", "25-April-2016");
    }
    public void testPrescription() throws Exception
    {
        Assert.assertEquals("PR3", presc.getPrescriptionID());
    }
    public void testUpdate() throws Exception
    {
        PrescriptionImpl preUpdate = new PrescriptionImpl.Builder(presc.getPrescriptionID())
                .copy(presc)
                .bPrescriptionDate("30-April-2016")
                .build();

        Assert.assertNotNull(preUpdate);
        Assert.assertEquals(preUpdate.getPrescriptionDate(),"30-April-2016");
    }
}
