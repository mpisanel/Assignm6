package com.pharmacy_domain_driven.factories.DoctorT;
import com.pharmacy_domain_driven.domain.Doctor.Impl.DoctorImp;
import com.pharmacy_domain_driven.factory.Doctor.DoctorFactory;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by SONY on 2016-04-16.
 */
public class DoctorTest extends TestCase
{
    DoctorImp doct;

    @Override
    public void setUp() throws Exception
    {
        doct = DoctorFactory.getDoctor("DOC7", "Gugu");
    }

    public void testDoctor() throws Exception
    {
        Assert.assertEquals("DOC7", doct.getDoctorID());
    }

    public void testUpdate() throws Exception
    {
        DoctorImp doc = new DoctorImp.Builder(doct.getDoctorID())
                .copy(doct)
                .bDocName("Luxolo")
                .build();

        Assert.assertNotNull(doc);
        Assert.assertEquals("Luxolo", doc.getDoctorName());
    }
}
