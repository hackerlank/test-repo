/*
*  Autshumato Terminology Management System (TMS)
*  Free web application for the management of multilingual terminology databases (termbanks). 
*
*  Copyright (C) 2013 Centre for Text Technology (CTexT�), North-West University
*  and Department of Arts and Culture, Government of South Africa
*  Home page: http://www.nwu.co.za/ctext
*  Project page: http://autshumatotms.sourceforge.net
*   
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/

package tms2.client.i18n;

import com.google.gwt.core.client.GWT;

/**
 * 
 * @author I. Lavangee
 *
 */
public class Internationalization 
{
	private static final TMSConstants _constants = GWT.create(TMSConstants.class);
	private static final TMSMessages _messages = GWT.create(TMSMessages.class);
	
	private static Internationalization _i18n = null;
	
	public static Internationalization getInstance()
	{
		if (_i18n == null)
			_i18n = new Internationalization();
		
		return _i18n;
	}
	
	private Internationalization() 
	{
		
	}
	
	public TMSConstants getConstants()
	{
		return _constants;
	}
	
	public TMSMessages getMessages()
	{
		return _messages;
	}
}
