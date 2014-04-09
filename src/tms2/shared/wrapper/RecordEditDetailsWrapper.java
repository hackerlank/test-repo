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

package tms2.shared.wrapper;

import java.util.ArrayList;

import tms2.shared.InputModel;
import tms2.shared.TermBase;
import tms2.shared.User;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * 
 * @author I. Lavangee
 *
 */
public class RecordEditDetailsWrapper implements IsSerializable
{
	private InputModel _inputmodel = null;
	private ArrayList<TermBase> _termbases = null;
	private User _user = null;
	
	public RecordEditDetailsWrapper()
	{
		
	}
	
	public void setInputModel(InputModel inputmodel)
	{
		_inputmodel = inputmodel;
	}
	
	public InputModel getInputModel()
	{
		return _inputmodel;
	}
	
	public void setTermBases(ArrayList<TermBase> termbases)
	{
		_termbases = termbases;
	}
	
	public ArrayList<TermBase> getTermBases()
	{
		return _termbases;
	}
	
	public void setUser(User user)
	{
		_user = user;
	}
	
	public User getUser()
	{
		return _user;
	}
}
