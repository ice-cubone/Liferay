package com.ejemploportlet.portlet;

import com.ejemploportlet.constants.ejemploPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author grupodot
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.Aditya",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Ejemplo Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + ejemploPortletKeys.ejemplo,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ejemploPortlet extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		
	System.out.println("Ejemplo de un portlet");
		super.doView(renderRequest, renderResponse);
	}
	
}