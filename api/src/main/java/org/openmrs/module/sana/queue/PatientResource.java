package org.openmrs.module.sana.queue;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

/**
 * Provides a simple RESTful access to patients
 */
@Deprecated
public class PatientResource  {
	
	private static final long serialVersionUID = -5695748L;
    private Log log = LogFactory.getLog(this.getClass());

	/**
	 * Handle all requests to this resource
	 */

	/**
	 * Auto generated method comment
	 * 
	 * @param out
	 * @param outputType
	 * @param patientList
	 */
	public static void printPatientList(PrintWriter out,StringBuffer sbr) {
	
		
			out.print("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			out.print("<patientList version=\"1.o\">");
				out.print(sbr);
			out.print("</patientList>");
		} 
}
	

