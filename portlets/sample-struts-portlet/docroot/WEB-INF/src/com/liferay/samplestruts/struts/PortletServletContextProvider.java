package com.liferay.samplestruts.struts;

import com.liferay.portal.kernel.portlet.LiferayPortletContext;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.portals.bridges.common.ServletContextProvider;

public class PortletServletContextProvider implements ServletContextProvider {

	public HttpServletRequest getHttpServletRequest(
		GenericPortlet portlet, PortletRequest request) {

		return PortalUtil.getHttpServletRequest(request);
	}

	public HttpServletResponse getHttpServletResponse(
		GenericPortlet portlet, PortletResponse response) {

		return PortalUtil.getHttpServletResponse(response);
	}

	public ServletContext getServletContext(GenericPortlet portlet) {
		return ((LiferayPortletContext)portlet.getPortletContext()).
			getServletContext();
	}

}